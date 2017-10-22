package pocketcoder.idnijuan.business.component;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import pocketcoder.idnijuan.business.module.injector.ActivityBindingModule;
import pocketcoder.idnijuan.business.module.injector.ContextBindingModule;
import pocketcoder.idnijuan.business.module.injector.FragmentBindingModule;
import pocketcoder.idnijuan.business.module.networkservice.NetworkServiceModule;
import pocketcoder.idnijuan.business.module.sqlite.SqliteModule;
import pocketcoder.idnijuan.business.scope.InjectorScope;


@InjectorScope
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ContextBindingModule.class,
                ActivityBindingModule.class,
                FragmentBindingModule.class,
                SqliteModule.class,
                NetworkServiceModule.class
})
public interface InjectorComponent extends AndroidInjector<DaggerApplication>{
    @Override void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance Builder setApplication(Application application);
        @BindsInstance Builder setNetworkService(NetworkServiceModule networkServiceModule);
        @BindsInstance Builder setSqlite(SqliteModule sqliteModule);
       InjectorComponent build();
    }

}
