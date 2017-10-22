package pocketcoder.idnijuan.presentation.fragment.feed;

import android.os.Bundle;

import pocketcoder.idnijuan.business.module.fragment.feed.FeedContract;
import pocketcoder.idnijuan.presentation.fragment.feedsocial.FeedSocialController;

public class FeedController extends FeedView implements FeedContract.Event {
    @Override
    public void initialization(Bundle bundle) {

    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }

    @Override
    public void setupPage() {
        //addPage("News",new FeedNewsController());
        addPage("Social Media",new FeedSocialController());
    }
}
