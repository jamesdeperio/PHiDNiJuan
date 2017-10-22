package pocketcoder.idnijuan.presentation.activity.loader;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import pocketcoder.idnijuan.integration.dao.table.AccountTableDao;

public class LoaderController extends LoaderView {
    @Inject AccountTableDao accountTable;

    @Override
    public void initialization(Bundle bundle) {
        Log.e( "initialization: ", String.valueOf(accountTable.queryBuilder().count()));
    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }
}
