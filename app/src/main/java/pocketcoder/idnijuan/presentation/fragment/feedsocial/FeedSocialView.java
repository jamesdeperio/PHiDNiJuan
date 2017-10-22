package pocketcoder.idnijuan.presentation.fragment.feedsocial;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import jamesdeperio.github.com.codepocket.helper.layoutmanager.RecyclerLinearLayoutManager;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialContract;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialAdapter;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;

public abstract class FeedSocialView extends DIBaseFragment implements FeedSocialContract.ViewMethod {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @Override
    public int initContentView() {
        return R.layout.fragment_social;
    }

    @Override
    public FragmentActivity getFragmentActivity() {
        return getActivity();
    }

    @Override
    public void initRecyclerView(FeedSocialAdapter adapter) {
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new RecyclerLinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
    }
}
