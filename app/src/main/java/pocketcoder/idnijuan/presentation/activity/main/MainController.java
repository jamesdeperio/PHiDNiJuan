package pocketcoder.idnijuan.presentation.activity.main;

import android.os.Bundle;

import pocketcoder.idnijuan.business.module.activity.main.MainContract;

public class    MainController extends MainView implements MainContract.Event {
    @Override
    public void initialization(Bundle bundle) {
    }

    @Override
    public void onLoadEvent(Bundle bundle) {
        loadMainContentFragment();
    }

}
