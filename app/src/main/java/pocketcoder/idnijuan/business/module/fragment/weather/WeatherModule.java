package pocketcoder.idnijuan.business.module.fragment.weather;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.component.DaggerWeatherAdapterComponent;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.fragment.weather.WeatherController;

@Module
public abstract class WeatherModule {
    @Binds public abstract WeatherContract.ViewMethod bindsViewMethod(WeatherController controller);
    @FragmentScope @Provides
    public static WeatherContract.Presenter providesPresenter(WeatherContract.ViewMethod viewMethod, NetworkService networkService) {
        WeatherPresenter presenter= new WeatherPresenter(viewMethod,networkService.getWeatherService());
        DaggerWeatherAdapterComponent.builder().weatherModule(new pocketcoder.idnijuan.business.module.fragment.weather.adapter.WeatherModule(viewMethod)).build().inject(presenter);
        return presenter;
    }
}