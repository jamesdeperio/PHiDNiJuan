package pocketcoder.idnijuan.presentation.fragment.statistic;

import android.os.Bundle;
import android.webkit.WebSettings;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.module.fragment.statistic.StatisticContract;

public class StatisticController extends StatisticView implements StatisticContract.Event {
    @Inject StatisticContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setAllowContentAccess(true);

        webView.loadUrl("http://idnijuan.x10host.com/idjuan/map.php");
    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }

}
