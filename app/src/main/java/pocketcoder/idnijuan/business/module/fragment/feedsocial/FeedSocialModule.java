package pocketcoder.idnijuan.business.module.fragment.feedsocial;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.component.DaggerSocialAdapterComponent;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.fragment.feedsocial.FeedSocialController;

@Module
public abstract class FeedSocialModule {
    @Binds public abstract FeedSocialContract.ViewMethod bindsViewMethod(FeedSocialController controller);
    @FragmentScope @Provides
    public static FeedSocialContract.Presenter providesPresenter(FeedSocialContract.ViewMethod viewMethod, NetworkService networkService) {
        FeedSocialPresenter socialPresenter=new FeedSocialPresenter(viewMethod,networkService.getSocialService());
        DaggerSocialAdapterComponent.builder().feedSocialModule(new pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialModule(viewMethod)).build().inject(socialPresenter);
        return socialPresenter;
    }
}