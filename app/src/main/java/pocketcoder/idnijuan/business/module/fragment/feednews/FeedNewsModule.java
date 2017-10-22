package pocketcoder.idnijuan.business.module.fragment.feednews;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.fragment.feednews.FeedNewsController;

@Module
public abstract class FeedNewsModule {
    @Binds public abstract FeedNewsContract.ViewMethod bindsViewMethod(FeedNewsController controller);
    @FragmentScope @Provides
    public static FeedNewsContract.Presenter providesPresenter(FeedNewsContract.ViewMethod viewMethod, NetworkService networkService) {
        return new FeedNewsPresenter(viewMethod);
    }
}