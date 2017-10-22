package pocketcoder.idnijuan.integration.service;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import jamesdeperio.github.com.codepocket.service.RetrofitService;
import lombok.Getter;
import pocketcoder.idnijuan.integration.memo.MemoService;
import pocketcoder.idnijuan.integration.service.face.ProfilesService;
import pocketcoder.idnijuan.integration.service.social.SocialService;
import pocketcoder.idnijuan.integration.service.weather.WeatherService;


public class NetworkService extends RetrofitService {
    @Getter private ProfilesService service;
    @Getter private MemoService memoService;
    @Getter private SocialService socialService;
    @Getter private WeatherService weatherService;
    public NetworkService(Context context) {
        service= (ProfilesService) initialize(context,ProfilesService.class);
        memoService = (MemoService) initialize(context, MemoService.class);
        socialService = (SocialService) initialize(context, SocialService.class);
        weatherService = (WeatherService) initialize(context, WeatherService.class);
    }

    @Override
    public long initConnectTimeOut() {
        return 1000;
    }

    @Override
    public long initReadTimeOut() {
        return 1000;
    }

    @Override
    public long initWriteTimeOut() {
        return 1000;
    }

    @Override
    public int setCacheSize() {
        return 1;
    }

    @NotNull
    @Override
    public String setBaseURL() {
        return "http://idnijuan.x10host.com/idjuan/";
    }
}
