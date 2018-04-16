package com.kye.model.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.kye.model.bean.common_tool.CommonToolItemBean;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class CommonToolDao_Impl implements CommonToolDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCommonToolItemBean;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCommonToolItemBean;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CommonToolDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCommonToolItemBean = new EntityInsertionAdapter<CommonToolItemBean>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `common_tools`(`id`,`name`,`isSelected`,`position`,`positionSelected`,`positionUnselected`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CommonToolItemBean value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp;
        _tmp = value.isSelected() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getPosition());
        stmt.bindLong(5, value.getPositionSelected());
        stmt.bindLong(6, value.getPositionUnselected());
      }
    };
    this.__deletionAdapterOfCommonToolItemBean = new EntityDeletionOrUpdateAdapter<CommonToolItemBean>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `common_tools` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CommonToolItemBean value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM common_tools";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<CommonToolItemBean> selectedCommonTools) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCommonToolItemBean.insert(selectedCommonTools);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(List<CommonToolItemBean> selectedCommonTools) {
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfCommonToolItemBean.insertAndReturnIdsList(selectedCommonTools);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(CommonToolItemBean selectedCommonTool) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCommonToolItemBean.insertAndReturnId(selectedCommonTool);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(CommonToolItemBean commonToolItemBean) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCommonToolItemBean.handle(commonToolItemBean);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(List<CommonToolItemBean> commonToolItemBeans) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCommonToolItemBean.handleMultiple(commonToolItemBeans);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Flowable<List<CommonToolItemBean>> queryAllFlowable() {
    final String _sql = "SELECT * FROM common_tools";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"common_tools"}, new Callable<List<CommonToolItemBean>>() {
      public List<CommonToolItemBean> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
          final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
          final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
          final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
          final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CommonToolItemBean _item;
            _item = new CommonToolItemBean();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final boolean _tmpIsSelected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
            _tmpIsSelected = _tmp != 0;
            _item.setSelected(_tmpIsSelected);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final int _tmpPositionSelected;
            _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
            _item.setPositionSelected(_tmpPositionSelected);
            final int _tmpPositionUnselected;
            _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
            _item.setPositionUnselected(_tmpPositionUnselected);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<CommonToolItemBean> queryAll() {
    final String _sql = "SELECT * FROM common_tools";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
      final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
      final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CommonToolItemBean _item;
        _item = new CommonToolItemBean();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final boolean _tmpIsSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
        _tmpIsSelected = _tmp != 0;
        _item.setSelected(_tmpIsSelected);
        final int _tmpPosition;
        _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        _item.setPosition(_tmpPosition);
        final int _tmpPositionSelected;
        _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
        _item.setPositionSelected(_tmpPositionSelected);
        final int _tmpPositionUnselected;
        _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
        _item.setPositionUnselected(_tmpPositionUnselected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CommonToolItemBean query(int id) {
    final String _sql = "SELECT * FROM common_tools WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
      final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
      final CommonToolItemBean _result;
      if(_cursor.moveToFirst()) {
        _result = new CommonToolItemBean();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final boolean _tmpIsSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
        _tmpIsSelected = _tmp != 0;
        _result.setSelected(_tmpIsSelected);
        final int _tmpPosition;
        _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        _result.setPosition(_tmpPosition);
        final int _tmpPositionSelected;
        _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
        _result.setPositionSelected(_tmpPositionSelected);
        final int _tmpPositionUnselected;
        _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
        _result.setPositionUnselected(_tmpPositionUnselected);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flowable<List<CommonToolItemBean>> querySelectedFlowable() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"common_tools"}, new Callable<List<CommonToolItemBean>>() {
      public List<CommonToolItemBean> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
          final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
          final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
          final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
          final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CommonToolItemBean _item;
            _item = new CommonToolItemBean();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final boolean _tmpIsSelected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
            _tmpIsSelected = _tmp != 0;
            _item.setSelected(_tmpIsSelected);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final int _tmpPositionSelected;
            _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
            _item.setPositionSelected(_tmpPositionSelected);
            final int _tmpPositionUnselected;
            _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
            _item.setPositionUnselected(_tmpPositionUnselected);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<CommonToolItemBean>> queryUnselectedFlowable() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"common_tools"}, new Callable<List<CommonToolItemBean>>() {
      public List<CommonToolItemBean> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
          final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
          final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
          final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
          final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CommonToolItemBean _item;
            _item = new CommonToolItemBean();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final boolean _tmpIsSelected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
            _tmpIsSelected = _tmp != 0;
            _item.setSelected(_tmpIsSelected);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final int _tmpPositionSelected;
            _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
            _item.setPositionSelected(_tmpPositionSelected);
            final int _tmpPositionUnselected;
            _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
            _item.setPositionUnselected(_tmpPositionUnselected);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<List<CommonToolItemBean>> querySelectedSingle() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<CommonToolItemBean>>() {
      public List<CommonToolItemBean> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
          final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
          final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
          final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
          final java.util.List<com.kye.model.bean.common_tool.CommonToolItemBean> _result = new java.util.ArrayList<com.kye.model.bean.common_tool.CommonToolItemBean>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.kye.model.bean.common_tool.CommonToolItemBean _item;
            _item = new com.kye.model.bean.common_tool.CommonToolItemBean();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final boolean _tmpIsSelected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
            _tmpIsSelected = _tmp != 0;
            _item.setSelected(_tmpIsSelected);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final int _tmpPositionSelected;
            _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
            _item.setPositionSelected(_tmpPositionSelected);
            final int _tmpPositionUnselected;
            _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
            _item.setPositionUnselected(_tmpPositionUnselected);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    });
  }

  @Override
  public Single<List<CommonToolItemBean>> queryUnselectedSingle() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<CommonToolItemBean>>() {
      public List<CommonToolItemBean> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
          final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
          final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
          final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
          final java.util.List<com.kye.model.bean.common_tool.CommonToolItemBean> _result = new java.util.ArrayList<com.kye.model.bean.common_tool.CommonToolItemBean>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.kye.model.bean.common_tool.CommonToolItemBean _item;
            _item = new com.kye.model.bean.common_tool.CommonToolItemBean();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final boolean _tmpIsSelected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
            _tmpIsSelected = _tmp != 0;
            _item.setSelected(_tmpIsSelected);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final int _tmpPositionSelected;
            _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
            _item.setPositionSelected(_tmpPositionSelected);
            final int _tmpPositionUnselected;
            _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
            _item.setPositionUnselected(_tmpPositionUnselected);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    });
  }

  @Override
  public List<CommonToolItemBean> querySelected() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
      final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
      final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CommonToolItemBean _item;
        _item = new CommonToolItemBean();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final boolean _tmpIsSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
        _tmpIsSelected = _tmp != 0;
        _item.setSelected(_tmpIsSelected);
        final int _tmpPosition;
        _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        _item.setPosition(_tmpPosition);
        final int _tmpPositionSelected;
        _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
        _item.setPositionSelected(_tmpPositionSelected);
        final int _tmpPositionUnselected;
        _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
        _item.setPositionUnselected(_tmpPositionUnselected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CommonToolItemBean> queryUnselected() {
    final String _sql = "SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsSelected = _cursor.getColumnIndexOrThrow("isSelected");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfPositionSelected = _cursor.getColumnIndexOrThrow("positionSelected");
      final int _cursorIndexOfPositionUnselected = _cursor.getColumnIndexOrThrow("positionUnselected");
      final List<CommonToolItemBean> _result = new ArrayList<CommonToolItemBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CommonToolItemBean _item;
        _item = new CommonToolItemBean();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final boolean _tmpIsSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
        _tmpIsSelected = _tmp != 0;
        _item.setSelected(_tmpIsSelected);
        final int _tmpPosition;
        _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        _item.setPosition(_tmpPosition);
        final int _tmpPositionSelected;
        _tmpPositionSelected = _cursor.getInt(_cursorIndexOfPositionSelected);
        _item.setPositionSelected(_tmpPositionSelected);
        final int _tmpPositionUnselected;
        _tmpPositionUnselected = _cursor.getInt(_cursorIndexOfPositionUnselected);
        _item.setPositionUnselected(_tmpPositionUnselected);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
