package pocketcoder.idnijuan.presentation.fragment.feed;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.feed.FeedContract;
import pocketcoder.idnijuan.presentation.base.DIBaseTabbedFragment;

@SuppressWarnings("ConstantConditions")
public abstract class FeedView extends DIBaseTabbedFragment implements FeedContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.fragment_feed;
    }

    @NotNull
    @Override
    public ViewPager initViewPager() {
        return getRootView().findViewById(R.id.viewPager);
    }

    @Nullable
    @Override
    public TabLayout initTabLayout() {
        return getRootView().findViewById(R.id.tabLayout);
    }


}
