package pocketcoder.idnijuan.business.module.fragment.maincontent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.presentation.fragment.maincontent.MainContentController;

@Module
public abstract class MainContentModule {
    @Binds public abstract MainContentContract.ViewMethod bindsViewMethod(MainContentController controller);
    @FragmentScope @Provides
    public static MainContentContract.Presenter providesPresenter(MainContentContract.ViewMethod viewMethod) {
        return new MainContentPresenter(viewMethod);
    }
}