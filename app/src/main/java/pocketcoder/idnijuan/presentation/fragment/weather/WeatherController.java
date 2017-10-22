package pocketcoder.idnijuan.presentation.fragment.weather;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;

import javax.inject.Inject;

import butterknife.BindView;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.model.weather.WeatherForeCast;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherContract;

public class WeatherController extends WeatherView implements WeatherContract.Event {
    @Inject WeatherContract.Presenter presenter;
    @BindView(R.id.main_image)
    ImageView main_image;
   @BindView( R.id.main_title)
   TextView main_title;
    @BindView( R.id.main_weather_high)
            TextView main_weather_high;
    @BindView(R.id.tv_detail) TextView tvDetail;
    @BindView(R.id.weather_detail1) TextView weather_detail1;
    @BindView(R.id.weather_detail2) TextView weather_detail2;

    @Override
    public void initialization(Bundle bundle) {
        initRecyclerView(presenter.getAdapter());
        try {
            WeatherForeCast weatherForecast = presenter.getWeatherForecast();
            main_title.setText(weatherForecast.getMQuery().getMResults().getMChannel().getMItem().getMCondition().getMText());
            main_weather_high.setText(weatherForecast.getMQuery().getMResults().getMChannel().getMItem().getMCondition().getMTemp());
            tvDetail.setText("Details: ("+weatherForecast.getMQuery().getMResults().getMChannel().getMItem().getMCondition().getMDate()+")");
            weather_detail1.setText("Humidity: "+weatherForecast.getMQuery().getMResults().getMChannel().getMAtmosphere().getMHumidity()+"%\nVisibility: "
                    +weatherForecast.getMQuery().getMResults().getMChannel().getMAtmosphere().getMVisibility()+" km");
            weather_detail2.setText("Sunrise: "+weatherForecast.getMQuery().getMResults().getMChannel().getMAstronomy().getMSunrise()
                    +"\nSunset: "+weatherForecast.getMQuery().getMResults().getMChannel().getMAstronomy().getMSunset());
            Glide.with(getContext())
                    .load(getWeatherCode(Integer.parseInt(weatherForecast.getMQuery().getMResults().getMChannel().getMItem().getMCondition().getMCode())))
                    .into(main_image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private int getWeatherCode(int code) {
        int image;
        if(code==0 || code==2){
            image=R.drawable.tornado;
        }else if(code==17){
            image=R.drawable.hail;
        }else if(code==3200){
            image=R.drawable.notavailable;
        }else if(code==21){
            image=R.drawable.haze;
        }else if(code==1 || code==3 ||
                code==4 || code==37 ||
                code==3 || code==38 ||
                code==39||
                code==47){
            image=R.drawable.thunderstorm;
        }else if(code==5 ){
            image=R.drawable.snowrain;
        }else if(code==8 || code==9 ){
            image=R.drawable.drizzle;
        }else if(code==22 || code==23 ||
                code==24 || code==25 ){
            image=R.drawable.windy;
        }else if(code==7 || code== 13 ||
                code==14 || code==15 ||
                code==16 || code==41||
                code==43 || code==46 ){
            image=R.drawable.snow;
        }else if(code==42){
            image=R.drawable.scatteredsnowshower;
        }else if(code==11 ||code==12 ||
                code==40 ){
            image=R.drawable.shower;
        }else if(code==6 ||code==10  ){
            image=R.drawable.rain;
        }else if(code==30 ){
            image=R.drawable.partlycloudyday;
        }else if(code==29 ){
            image=R.drawable.partlycloudynight;
        }else if(code==28 ){
            image=R.drawable.mostlycloudyday;
        }else if(code==27 ){
            image=R.drawable.mostlycloudynight;
        }else if(code==20 || code==25){
            image=R.drawable.mist;
        }else if(code==32 ||code==34){
            image=R.drawable.hot;
        }else if(code==31 || code==33){
            image=R.drawable.clear;
        }else{
            image=R.drawable.partlycloudynight;
        }
        return image;
    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }

}
