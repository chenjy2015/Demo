package com.kye.model.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.kye.model.bean.order.UrgeRecordBean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class UrgeRecordDao_Impl implements UrgeRecordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUrgeRecordBean;

  public UrgeRecordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUrgeRecordBean = new EntityInsertionAdapter<UrgeRecordBean>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `urge_records`(`code`,`time`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UrgeRecordBean value) {
        if (value.getCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCode());
        }
        stmt.bindLong(2, value.getTime());
      }
    };
  }

  @Override
  public long insert(UrgeRecordBean urgeRecordBean) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUrgeRecordBean.insertAndReturnId(urgeRecordBean);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public UrgeRecordBean query(String code) {
    final String _sql = "SELECT * FROM urge_records WHERE code = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfTime = _cursor.getColumnIndexOrThrow("time");
      final UrgeRecordBean _result;
      if(_cursor.moveToFirst()) {
        _result = new UrgeRecordBean();
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        _result.setCode(_tmpCode);
        final long _tmpTime;
        _tmpTime = _cursor.getLong(_cursorIndexOfTime);
        _result.setTime(_tmpTime);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
