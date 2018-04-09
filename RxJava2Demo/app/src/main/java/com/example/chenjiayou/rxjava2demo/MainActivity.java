package com.example.chenjiayou.rxjava2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        create();
//        fromIterable();
//        defer();
//        interval();
//        range();
//        timer();
//        repeat();
        flowable();
    }

    public void create() {

        //Observable的创建：（被观察者 发送事件）
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                e.onNext("create() ->  observable 基础使用");
            }
        });

        //Observer的创建：（观察者 事件消费）
        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object o) {
                Log.d(TAG, (String) o);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        //订阅
        observable.subscribe(observer);
    }

    /**
     * 遍历集合
     */
    public void fromIterable() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Observable.fromIterable(list).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                Log.d(TAG, "item: " + integer);
            }
        });
    }

    /**
     * 延迟发送
     * 当观察者订阅时，才创建Observable，并且针对每个观察者创建都是一个新的Observable
     */
    public void defer() {
        Observable<String> observable = Observable.defer(new Callable<ObservableSource<? extends String>>() {
            @Override
            public ObservableSource<? extends String> call() throws Exception {
                return Observable.just("hello");
            }
        });

        observable
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Log.d(TAG, s);
                    }
                });
    }


    /**
     * 定时发送
     */
    public void interval() {
        Observable<Long> observable = Observable.interval(2, TimeUnit.SECONDS);
        observable
//                .map(new Function<Long, Long>() {
//                    @Override
//                    public Long apply(Long aLong) throws Exception {
//                        return new Random().nextLong();
//                    }
//                })
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        Log.d(TAG, "" + aLong);
                    }
                });
    }

    /**
     * 发送特定整数序列
     * 创建一个发射特定整数序列的Observable，第一个参数为起始值，第二个为发送的个数，如果为0则不发送，负数则抛异常
     */
    public void range() {
        Observable
                .range(1, 20)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.d(TAG, "" + integer);
                    }
                });
    }

    public void timer() {
        final Calendar calendar = Calendar.getInstance();
        Observable
                .timer(2, TimeUnit.SECONDS)
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        calendar.setTime(new Date(System.currentTimeMillis()));
                        Log.d(TAG, "doOnSubscribe  " + String.valueOf(calendar.get(Calendar.SECOND)));
                    }
                })
                .doAfterNext(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        calendar.setTime(new Date(System.currentTimeMillis()));
                        Log.d(TAG, "doAfterNext  " + String.valueOf(calendar.get(Calendar.SECOND)));
                    }
                })
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        calendar.setTime(new Date(System.currentTimeMillis()));
                        Log.d(TAG, "subscribe  " + String.valueOf(calendar.get(Calendar.SECOND)));
                    }
                });
    }

    /**
     * 循环发送
     */
    public void repeat() {
        Observable
                .just(123)
                .repeat()
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.d(TAG, "repeat  " + String.valueOf(integer));
                    }
                });
    }


    /**
     * 背压
     */
    public void flowable() {
        Flowable
                .create(new FlowableOnSubscribe<Integer>() {
                    @Override
                    public void subscribe(FlowableEmitter<Integer> e) throws Exception {
                                for (int i=0; i<129; i++){
                                    e.onNext(i);
                                }
                    }
                }, BackpressureStrategy.ERROR)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        //设置最大消费事件数量 如果不显示调用request就表示消费能力为0
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Integer integer) {
//                        try {
//                            Thread.sleep(20);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        Log.d(TAG, integer + "");
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.d(TAG, t.getMessage() + "");
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete");
                    }
                });
    }
}
