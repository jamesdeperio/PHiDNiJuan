package pocketcoder.idnijuan.presentation.fragment.feednews;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.feednews.FeedNewsContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;

public abstract class FeedNewsView extends DIBaseFragment implements FeedNewsContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.fragment_feednews;
    }

}
