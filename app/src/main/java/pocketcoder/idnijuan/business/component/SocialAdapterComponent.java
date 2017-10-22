package pocketcoder.idnijuan.business.component;

import javax.inject.Singleton;

import dagger.Component;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialPresenter;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialModule;

/**
 * Created by jamesdeperio on 09/22/2017.
 * ph.nyxsys.cmbfilminventory.integration.service
 */
@Singleton
@Component(modules = {FeedSocialModule.class})
public interface SocialAdapterComponent {
    void inject(FeedSocialPresenter presenter);
}
