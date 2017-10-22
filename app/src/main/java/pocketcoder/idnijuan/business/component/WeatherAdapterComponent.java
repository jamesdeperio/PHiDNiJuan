package pocketcoder.idnijuan.business.component;

import javax.inject.Singleton;

import dagger.Component;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherPresenter;
import pocketcoder.idnijuan.business.module.fragment.weather.adapter.WeatherModule;

/**
 * Created by jamesdeperio on 09/22/2017.
 * ph.nyxsys.cmbfilminventory.integration.service
 */
@Singleton
@Component(modules = {WeatherModule.class})
public interface WeatherAdapterComponent {
    void inject(WeatherPresenter presenter);
}
