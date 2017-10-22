package pocketcoder.idnijuan.business.module.fragment.weather.adapter;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import pocketcoder.idnijuan.business.model.weather.Forecast;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherContract;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;
import pocketcoder.idnijuan.presentation.fragment.weather.viewholder.WeatherViewHolder;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.business.module.fragment.weather.adapter
 */

public class WeatherAdapter extends PocketAdapter {
   @Getter @Setter private List<Forecast> yweatherForecasts= new ArrayList<>();
    @Getter @Setter private List<Forecast> filteryweatherForecasts= new ArrayList<>();
    public WeatherAdapter(WeatherContract.ViewMethod viewMethod){
        addViewHolder(new WeatherViewHolder(this,viewMethod));
    }

    @Override
    public int getDataCount() {
        return filteryweatherForecasts.size();
    }
}
