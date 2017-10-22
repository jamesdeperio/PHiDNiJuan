package pocketcoder.idnijuan.presentation.fragment.profile;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.profile.ProfileContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;

public abstract class ProfileView extends DIBaseFragment implements ProfileContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.activity_login;
    }

}
