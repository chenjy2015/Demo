package com.kye.model.content_resolver;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class RxContentResolver {
    public static Flowable<Cursor> getFlowable(
            final ContentResolver contentResolver,
            final Uri uri,
            final String[] projection,
            final String selection,
            final String[] selectionArgs,
            final String sortOrder,
            CancellationSignal cancellationSignal
    ) {
        return Flowable.create(new FlowableOnSubscribe<Cursor>() {
            @Override
            public void subscribe(FlowableEmitter<Cursor> e) throws Exception {
                Cursor query = null;
                try {
                    query = contentResolver.query(
                            uri,
                            projection,
                            null,
                            null,
                            null,
                            null
                    );

                    if (query == null) {
                        e.onError(new NullPointerException("cursor query is null"));
                        return;
                    }

                    while (query.moveToNext()) e.onNext(query);
                } catch (Throwable throwable) {
                    e.onError(throwable);
                } finally {
                    if (query != null) query.close();
                    e.onComplete();
                }
            }
        }, BackpressureStrategy.DROP)
                .subscribeOn(Schedulers.io());
    }
}
