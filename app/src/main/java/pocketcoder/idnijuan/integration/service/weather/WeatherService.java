package pocketcoder.idnijuan.integration.service.weather;

import pocketcoder.idnijuan.business.model.weather.WeatherForeCast;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.integration.service.social
 */

public interface WeatherService {
    @GET("rssContent.php")
    Call<WeatherForeCast> getWeather();
}
