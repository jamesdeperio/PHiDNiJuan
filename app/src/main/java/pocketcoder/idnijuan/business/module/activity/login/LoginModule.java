package pocketcoder.idnijuan.business.module.activity.login;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.activity.login.LoginController;

@Module
public abstract class LoginModule {
    @Binds public abstract LoginContract.ViewMethod bindsViewMethod(LoginController controller);
    @ActivityScope @Provides
    public static LoginContract.Presenter providesPresenter(LoginContract.ViewMethod viewMethod, NetworkService networkService) {
        return new LoginPresenter(viewMethod);
    }
}
