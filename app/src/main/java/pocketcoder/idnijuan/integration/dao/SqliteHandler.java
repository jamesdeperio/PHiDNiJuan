package pocketcoder.idnijuan.integration.dao;


import android.util.Log;

import org.greenrobot.greendao.database.Database;

import pocketcoder.idnijuan.business.app.MainApplication;
import pocketcoder.idnijuan.integration.dao.table.DaoMaster;

public class SqliteHandler extends DaoMaster.DevOpenHelper {

    public SqliteHandler(MainApplication mainApplication) {
        super(mainApplication, "db_idnijuan",null);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        Log.e("Version","old:"+oldVersion+"  new:"+newVersion);
    }
}