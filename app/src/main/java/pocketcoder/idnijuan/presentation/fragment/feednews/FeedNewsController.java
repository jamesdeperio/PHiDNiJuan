package pocketcoder.idnijuan.presentation.fragment.feednews;

import android.os.Bundle;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.module.fragment.feednews.FeedNewsContract;

public class FeedNewsController extends FeedNewsView implements FeedNewsContract.Event {
    @Inject FeedNewsContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {

    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }

}
