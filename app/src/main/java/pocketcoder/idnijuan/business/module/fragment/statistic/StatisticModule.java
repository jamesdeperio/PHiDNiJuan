package pocketcoder.idnijuan.business.module.fragment.statistic;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.fragment.statistic.StatisticController;

@Module
public abstract class StatisticModule {
    @Binds public abstract StatisticContract.ViewMethod bindsViewMethod(StatisticController controller);
    @FragmentScope @Provides
    public static StatisticContract.Presenter providesPresenter(StatisticContract.ViewMethod viewMethod, NetworkService networkService) {
        return new StatisticPresenter(viewMethod);
    }
}