package pocketcoder.idnijuan.presentation.fragment.feedsocial;

import android.os.Bundle;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialContract;

public class FeedSocialController extends FeedSocialView implements FeedSocialContract.Event {
    @Inject FeedSocialContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {
        initRecyclerView(presenter.getAdapter());
    }

    @Override
    public void onLoadEvent(Bundle bundle) {
        presenter.loadSocial();
    }

}
