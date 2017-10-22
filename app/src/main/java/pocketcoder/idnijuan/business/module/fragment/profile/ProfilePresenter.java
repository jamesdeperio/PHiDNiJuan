package pocketcoder.idnijuan.business.module.fragment.profile;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.integration.dao.table.AccountTableDao;

@RequiredArgsConstructor
public class ProfilePresenter implements  ProfileContract.Presenter {
    @NonNull private ProfileContract.ViewMethod viewMethod;
    @NonNull private AccountTableDao accountTableDao;
}
