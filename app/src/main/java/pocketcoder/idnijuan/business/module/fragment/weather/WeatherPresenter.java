package pocketcoder.idnijuan.business.module.fragment.weather;

import android.os.StrictMode;

import java.io.IOException;

import javax.inject.Inject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.business.model.weather.WeatherForeCast;
import pocketcoder.idnijuan.business.module.fragment.weather.adapter.WeatherAdapter;
import pocketcoder.idnijuan.integration.service.weather.WeatherService;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;

@RequiredArgsConstructor
public class WeatherPresenter implements  WeatherContract.Presenter {
    @NonNull private WeatherContract.ViewMethod viewMethod;
    @NonNull private WeatherService service;
    @Inject WeatherAdapter adapter;

    @Override
    public PocketAdapter getAdapter() {
        return adapter;
    }

    @Override
    public WeatherForeCast getWeatherForecast()  {
        WeatherForeCast weatherForecast= null;
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            weatherForecast = service.getWeather().execute().body();
            adapter.setYweatherForecasts(weatherForecast.getMQuery().getMResults().getMChannel().getMItem().getMForecast());
            adapter.setFilteryweatherForecasts(adapter.getYweatherForecasts());
            adapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherForecast;
    }
}
