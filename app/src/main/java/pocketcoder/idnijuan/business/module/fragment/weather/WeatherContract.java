package pocketcoder.idnijuan.business.module.fragment.weather;

import android.support.v4.app.FragmentActivity;

import java.io.IOException;

import pocketcoder.idnijuan.business.model.weather.WeatherForeCast;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;

public interface WeatherContract {
    interface Event {

    }
    interface ViewMethod {
        void initRecyclerView(PocketAdapter adapter);

        FragmentActivity getFragmentActivity();

    }
    interface Presenter {

        PocketAdapter getAdapter();

        WeatherForeCast getWeatherForecast() throws IOException;
    }
}
