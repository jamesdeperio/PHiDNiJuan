package pocketcoder.idnijuan.presentation.fragment.memo;

import android.os.Bundle;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.module.fragment.memo.adapter.MemoContract;

public class MemoController extends MemoView implements MemoContract.Event {
    @Inject MemoContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {

    }

    @Override
    public void onLoadEvent(Bundle bundle) {
        presenter.loadGraphList(tvPopulation,barChart,barChartOFW);
    }

}
