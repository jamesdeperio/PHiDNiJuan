package pocketcoder.idnijuan.business.module.fragment.feednews;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FeedNewsPresenter implements FeedNewsContract.Presenter {
    @NonNull private FeedNewsContract.ViewMethod viewMethod;

}
