package pocketcoder.idnijuan.presentation.activity.login;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.login.LoginContract;
import pocketcoder.idnijuan.presentation.base.DIBaseActivity;

public abstract class LoginView extends DIBaseActivity implements LoginContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.activity_login;
    }


}
