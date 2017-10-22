package pocketcoder.idnijuan.business.module.activity.main;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainPresenter implements MainContract.Presenter {
    @NonNull private MainContract.ViewMethod viewMethod;

}
