package pocketcoder.idnijuan.presentation.activity.main;

import jamesdeperio.github.com.codepocket.util.Navigate;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.main.MainContract;
import pocketcoder.idnijuan.presentation.base.DIBaseActivity;
import pocketcoder.idnijuan.presentation.fragment.maincontent.MainContentController;


public  abstract class MainView extends DIBaseActivity implements MainContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void loadMainContentFragment() {
        Navigate.INSTANCE.change(R.id.fragmentContainer).from(this).to(new MainContentController()).withBackStack(false).commit();

    }
}
