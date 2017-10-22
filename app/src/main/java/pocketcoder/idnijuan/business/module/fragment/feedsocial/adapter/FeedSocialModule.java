package pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialContract;

/**
 * Created by jamesdeperio on 9/20/2017
 * ph.nyxsys.cmbfilminventory.business.module.screen.loader
 */
@Module
public class FeedSocialModule {

    private FeedSocialContract.ViewMethod viewMethod;

    public FeedSocialModule(FeedSocialContract.ViewMethod viewMethod){
        this.viewMethod=viewMethod;
    }

    @Singleton
    @Provides
    public FeedSocialContract.ViewMethod providesView(){
        return viewMethod;
    }
    @Provides
    public FeedSocialAdapter providesAdapter(FeedSocialContract.ViewMethod viewMethod){
        return new FeedSocialAdapter(viewMethod);
    }}
