package pocketcoder.idnijuan.business.module.activity.loader;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.integration.dao.table.AccountTableDao;
import pocketcoder.idnijuan.integration.dao.table.DaoSession;
import pocketcoder.idnijuan.presentation.activity.loader.LoaderController;

@Module
public abstract class LoaderModule {
    @Binds public abstract LoaderContract.ViewMethod bindsViewMethod(LoaderController controller);

    @ActivityScope @Provides
    public static AccountTableDao providesAccountTable(DaoSession daoSession){
        return daoSession.getAccountTableDao();
    }

}

