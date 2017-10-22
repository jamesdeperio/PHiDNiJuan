package pocketcoder.idnijuan.presentation.fragment.memo;

import android.widget.TextView;

import butterknife.BindView;
import me.ithebk.barchart.BarChart;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.memo.adapter.MemoContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;

public abstract class MemoView extends DIBaseFragment implements MemoContract.ViewMethod {
    @BindView(R.id.bar_chart_job_statistics)
    BarChart barChart;
    @BindView(R.id.bar_chart_ofw_statistics)
    BarChart barChartOFW;

    @BindView(R.id.tvPopulation)
    TextView tvPopulation;

    @Override
    public int initContentView() {
        return R.layout.fragment_memo;
    }





}
