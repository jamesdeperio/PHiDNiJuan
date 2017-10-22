package pocketcoder.idnijuan.presentation.activity.loader;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.loader.LoaderContract;
import pocketcoder.idnijuan.presentation.base.DIBaseActivity;


public abstract class LoaderView extends DIBaseActivity implements LoaderContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.activity_loader;
    }
}
