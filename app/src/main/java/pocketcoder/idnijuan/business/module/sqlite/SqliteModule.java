package pocketcoder.idnijuan.business.module.sqlite;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.app.MainApplication;
import pocketcoder.idnijuan.business.scope.InjectorScope;
import pocketcoder.idnijuan.integration.dao.SqliteHandler;
import pocketcoder.idnijuan.integration.dao.table.DaoMaster;
import pocketcoder.idnijuan.integration.dao.table.DaoSession;


@Module
public class SqliteModule {
    @InjectorScope @Provides
    public DaoSession provideDaoSession(Application application){
        return new DaoMaster(new SqliteHandler((MainApplication) application).getWritableDb()).newSession();
    }
}
