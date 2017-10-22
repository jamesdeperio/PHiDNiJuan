package pocketcoder.idnijuan.business.module.networkservice;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.InjectorScope;
import pocketcoder.idnijuan.integration.service.NetworkService;


@Module
public class NetworkServiceModule {
    @InjectorScope @Provides
    public NetworkService provideNetworkService(Application application){
        return new NetworkService(application);
    }
}
