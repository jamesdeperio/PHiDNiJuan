package pocketcoder.idnijuan.presentation.fragment.statistic;

import android.webkit.WebView;

import butterknife.BindView;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.statistic.StatisticContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;

public abstract class StatisticView extends DIBaseFragment implements StatisticContract.ViewMethod {
    @BindView(R.id.webView)
    WebView webView;
    @Override
    public int initContentView() {
        return R.layout.fragment_statistic;
    }

}
