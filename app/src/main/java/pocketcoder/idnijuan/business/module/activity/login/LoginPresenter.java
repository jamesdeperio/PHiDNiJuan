package pocketcoder.idnijuan.business.module.activity.login;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginPresenter implements LoginContract.Presenter {
    @NonNull private LoginContract.ViewMethod viewMethod;

}
