package com.kye.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.kye.model.dao.CommonToolDao;
import com.kye.model.dao.CommonToolDao_Impl;
import com.kye.model.dao.UrgeRecordDao;
import com.kye.model.dao.UrgeRecordDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
public class AppDatabase_Impl extends AppDatabase {
  private volatile CommonToolDao _commonToolDao;

  private volatile UrgeRecordDao _urgeRecordDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `common_tools` (`id` INTEGER NOT NULL, `name` TEXT, `isSelected` INTEGER NOT NULL, `position` INTEGER NOT NULL, `positionSelected` INTEGER NOT NULL, `positionUnselected` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `urge_records` (`code` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`code`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"28fdf2fd303c18d90688692cdcc72aa5\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `common_tools`");
        _db.execSQL("DROP TABLE IF EXISTS `urge_records`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCommonTools = new HashMap<String, TableInfo.Column>(6);
        _columnsCommonTools.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCommonTools.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsCommonTools.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0));
        _columnsCommonTools.put("position", new TableInfo.Column("position", "INTEGER", true, 0));
        _columnsCommonTools.put("positionSelected", new TableInfo.Column("positionSelected", "INTEGER", true, 0));
        _columnsCommonTools.put("positionUnselected", new TableInfo.Column("positionUnselected", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCommonTools = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCommonTools = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCommonTools = new TableInfo("common_tools", _columnsCommonTools, _foreignKeysCommonTools, _indicesCommonTools);
        final TableInfo _existingCommonTools = TableInfo.read(_db, "common_tools");
        if (! _infoCommonTools.equals(_existingCommonTools)) {
          throw new IllegalStateException("Migration didn't properly handle common_tools(com.kye.model.bean.common_tool.CommonToolItemBean).\n"
                  + " Expected:\n" + _infoCommonTools + "\n"
                  + " Found:\n" + _existingCommonTools);
        }
        final HashMap<String, TableInfo.Column> _columnsUrgeRecords = new HashMap<String, TableInfo.Column>(2);
        _columnsUrgeRecords.put("code", new TableInfo.Column("code", "TEXT", true, 1));
        _columnsUrgeRecords.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUrgeRecords = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUrgeRecords = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUrgeRecords = new TableInfo("urge_records", _columnsUrgeRecords, _foreignKeysUrgeRecords, _indicesUrgeRecords);
        final TableInfo _existingUrgeRecords = TableInfo.read(_db, "urge_records");
        if (! _infoUrgeRecords.equals(_existingUrgeRecords)) {
          throw new IllegalStateException("Migration didn't properly handle urge_records(com.kye.model.bean.order.UrgeRecordBean).\n"
                  + " Expected:\n" + _infoUrgeRecords + "\n"
                  + " Found:\n" + _existingUrgeRecords);
        }
      }
    }, "28fdf2fd303c18d90688692cdcc72aa5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "common_tools","urge_records");
  }

  @Override
  public CommonToolDao commonToolDao() {
    if (_commonToolDao != null) {
      return _commonToolDao;
    } else {
      synchronized(this) {
        if(_commonToolDao == null) {
          _commonToolDao = new CommonToolDao_Impl(this);
        }
        return _commonToolDao;
      }
    }
  }

  @Override
  public UrgeRecordDao urgeRecordDao() {
    if (_urgeRecordDao != null) {
      return _urgeRecordDao;
    } else {
      synchronized(this) {
        if(_urgeRecordDao == null) {
          _urgeRecordDao = new UrgeRecordDao_Impl(this);
        }
        return _urgeRecordDao;
      }
    }
  }
}
