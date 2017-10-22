package pocketcoder.idnijuan.presentation.fragment.weather.viewholder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherContract;
import pocketcoder.idnijuan.business.module.fragment.weather.adapter.WeatherAdapter;
import pocketcoder.idnijuan.presentation.base.adapter.PocketViewHolder;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.presentation.fragment.weather.viewholder
 */
@RequiredArgsConstructor
public class WeatherViewHolder extends PocketViewHolder {
    @NonNull private WeatherAdapter adapter;
    @NonNull private WeatherContract.ViewMethod viewMethod;

    @Override
    public int initContentView() {
        return R.layout.list_weather;
    }

    @BindView(R.id.weather_img)
    ImageView weather_img;

    @BindView(R.id.weather_title)
    TextView weather_title;
    @BindView(R.id.weather_date)
    TextView weather_date;
    @BindView(R.id.weather_day)
    TextView weather_day;
    @BindView(R.id.weather_high)
    TextView weather_high;
    @BindView(R.id.weather_low)
    TextView weather_low;
    @Override
    public void onBindEvent(View view, int position) {
        Bitmap myBitmap = BitmapFactory.decodeResource(viewMethod.getFragmentActivity().getResources(),
                getWeatherCode(Integer.parseInt(adapter.getFilteryweatherForecasts().get(position).getMCode())));
        BitmapDrawable background = new BitmapDrawable(myBitmap);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            weather_img.setBackground(background);
        }else{
            weather_img.setBackgroundDrawable(background);
        }

        weather_date.setText(adapter.getFilteryweatherForecasts().get(position).getMDate());
        weather_day.setText(adapter.getFilteryweatherForecasts().get(position).getMDay());
        weather_high.setText(adapter.getFilteryweatherForecasts().get(position).getMHigh());
        weather_low.setText(adapter.getFilteryweatherForecasts().get(position).getMLow());
        weather_title.setText(adapter.getFilteryweatherForecasts().get(position).getMText());

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

}
