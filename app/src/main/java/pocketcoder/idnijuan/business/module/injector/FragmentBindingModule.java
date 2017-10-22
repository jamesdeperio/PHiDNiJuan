package pocketcoder.idnijuan.business.module.injector;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import pocketcoder.idnijuan.business.module.fragment.feed.FeedModule;
import pocketcoder.idnijuan.business.module.fragment.feednews.FeedNewsModule;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialModule;
import pocketcoder.idnijuan.business.module.fragment.maincontent.MainContentModule;
import pocketcoder.idnijuan.business.module.fragment.memo.adapter.MemoModule;
import pocketcoder.idnijuan.business.module.fragment.profile.ProfileModule;
import pocketcoder.idnijuan.business.module.fragment.statistic.StatisticModule;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherModule;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.presentation.fragment.feed.FeedController;
import pocketcoder.idnijuan.presentation.fragment.feednews.FeedNewsController;
import pocketcoder.idnijuan.presentation.fragment.feedsocial.FeedSocialController;
import pocketcoder.idnijuan.presentation.fragment.maincontent.MainContentController;
import pocketcoder.idnijuan.presentation.fragment.memo.MemoController;
import pocketcoder.idnijuan.presentation.fragment.profile.ProfileController;
import pocketcoder.idnijuan.presentation.fragment.statistic.StatisticController;
import pocketcoder.idnijuan.presentation.fragment.weather.WeatherController;


@Module(includes = AndroidInjectionModule.class)
public abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = MainContentModule.class)
    abstract MainContentController mainContentControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = FeedModule.class)
    abstract FeedController feedControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = FeedNewsModule.class)
    abstract FeedNewsController feedNewsControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = FeedSocialModule.class)
    abstract FeedSocialController feedSocialControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = MemoModule.class)
    abstract MemoController memoControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = ProfileModule.class)
    abstract ProfileController profileControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = StatisticModule.class)
    abstract StatisticController statisticControllerInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = WeatherModule.class)
    abstract WeatherController weatherControllerInjector();

}