package pocketcoder.idnijuan.business.app;


import android.os.Process;
import android.os.StrictMode;

import org.greenrobot.greendao.query.QueryBuilder;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.component.DaggerInjectorComponent;
import pocketcoder.idnijuan.business.module.networkservice.NetworkServiceModule;
import pocketcoder.idnijuan.business.module.sqlite.SqliteModule;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainApplication extends DaggerApplication implements ApplicationContract {
    @Override
    public void onCreate() {
        super.onCreate();
        setupPriority();
        setupFont();
        setupSqlite();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return  DaggerInjectorComponent.builder()
                .setApplication(this)
                .setNetworkService(new NetworkServiceModule())
                .setSqlite(new SqliteModule()).build();
    }

    @Override
    public void setupFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/roboto-light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

    @Override
    public void setupSqlite() {
        QueryBuilder.LOG_VALUES =true;
        QueryBuilder.LOG_SQL =true;
    }

    @Override
    public void setupPriority() {

        Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }
}
