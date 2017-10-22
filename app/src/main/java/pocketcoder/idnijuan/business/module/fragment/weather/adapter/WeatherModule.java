package pocketcoder.idnijuan.business.module.fragment.weather.adapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherContract;

/**
 * Created by jamesdeperio on 9/20/2017
 * ph.nyxsys.cmbfilminventory.business.module.screen.loader
 */
@Module
public class WeatherModule {
    private WeatherContract.ViewMethod viewMethod;
    public WeatherModule(WeatherContract.ViewMethod viewMethod) {
        this.viewMethod=viewMethod;
    }

   @Singleton@Provides
    public WeatherContract.ViewMethod  providesView(){
        return viewMethod;
    }

    @Singleton@Provides
    public WeatherAdapter providesAdapter(WeatherContract.ViewMethod viewMethod){
        return new WeatherAdapter(viewMethod);
    }
}
