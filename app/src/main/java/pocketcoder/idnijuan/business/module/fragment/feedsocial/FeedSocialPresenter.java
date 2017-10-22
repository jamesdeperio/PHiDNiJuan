package pocketcoder.idnijuan.business.module.fragment.feedsocial;

import android.os.StrictMode;

import java.io.IOException;

import javax.inject.Inject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialAdapter;
import pocketcoder.idnijuan.integration.service.social.SocialService;

@RequiredArgsConstructor
public class FeedSocialPresenter implements FeedSocialContract.Presenter {
    @NonNull private FeedSocialContract.ViewMethod viewMethod;
    @NonNull private SocialService socialService;
    @Inject FeedSocialAdapter adapter;

    @Override
    public FeedSocialAdapter getAdapter() {
        return adapter;
    }

    @Override
    public void loadSocial() {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            adapter.setSocialList(socialService.getSocial().execute().body().getMItems());
            adapter.setFiterSocialList(adapter.getSocialList());
            adapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
