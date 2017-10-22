package pocketcoder.idnijuan.business.module.fragment.statistic;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StatisticPresenter implements  StatisticContract.Presenter {
    @NonNull private StatisticContract.ViewMethod viewMethod;

}
