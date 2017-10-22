package pocketcoder.idnijuan.business.module.fragment.maincontent;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainContentPresenter implements MainContentContract.Presenter {
    @NonNull private MainContentContract.ViewMethod viewMethod;

}
