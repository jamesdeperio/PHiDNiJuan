package pocketcoder.idnijuan.business.module.fragment.feed;

import dagger.Binds;
import dagger.Module;
import pocketcoder.idnijuan.presentation.fragment.feed.FeedController;

@Module
public abstract class FeedModule {
    @Binds public abstract FeedContract.ViewMethod bindsViewMethod(FeedController controller);
}
