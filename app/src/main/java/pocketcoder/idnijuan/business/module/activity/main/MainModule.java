package pocketcoder.idnijuan.business.module.activity.main;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.presentation.activity.main.MainController;

@Module
public abstract class MainModule {
    @Binds public abstract MainContract.ViewMethod bindsViewMethod(MainController controller);
    @ActivityScope
    @Provides
    public static MainContract.Presenter providesPresenter(MainContract.ViewMethod viewMethod) {
        return new MainPresenter(viewMethod);
    }
}
