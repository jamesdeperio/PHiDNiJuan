package pocketcoder.idnijuan.business.module.fragment.feedsocial;

import android.support.v4.app.FragmentActivity;

import pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialAdapter;

public interface FeedSocialContract {
    interface Event {

    }
    interface ViewMethod {
        void initRecyclerView(FeedSocialAdapter adapter);
        FragmentActivity getFragmentActivity();
    }
    interface Presenter {

        FeedSocialAdapter getAdapter();

        void loadSocial();
    }
}
