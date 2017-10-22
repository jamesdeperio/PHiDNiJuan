package pocketcoder.idnijuan.business.module.fragment.memo.adapter;

import android.widget.TextView;

import me.ithebk.barchart.BarChart;

public interface MemoContract {
    interface Event {

    }
    interface ViewMethod {

    }
    interface Presenter {

        void loadGraphList(TextView tvPopulation, BarChart barChart, BarChart barChartOFW);
    }
}