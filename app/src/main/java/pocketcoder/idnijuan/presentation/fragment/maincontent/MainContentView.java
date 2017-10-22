package pocketcoder.idnijuan.presentation.fragment.maincontent;

import android.app.Dialog;
import android.view.View;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

import butterknife.BindView;
import jamesdeperio.github.com.codepocket.util.Navigate;
import lombok.Setter;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.maincontent.MainContentContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;
import pocketcoder.idnijuan.presentation.fragment.feed.FeedController;
import pocketcoder.idnijuan.presentation.fragment.memo.MemoController;
import pocketcoder.idnijuan.presentation.fragment.profile.ProfileController;
import pocketcoder.idnijuan.presentation.fragment.statistic.StatisticController;
import pocketcoder.idnijuan.presentation.fragment.weather.WeatherController;

public abstract class MainContentView extends DIBaseFragment implements MainContentContract.ViewMethod {
    @BindView(R.id.spaceNavigationView) SpaceNavigationView spaceNavigationView;
    private Dialog scannerDialog;
    @Setter private View.OnClickListener qrcodeListener;
    @Setter private View.OnClickListener faceListener;


    public void createScannerDialog() {
        this.scannerDialog= new Dialog(getContext());
        this.scannerDialog.setContentView(R.layout.dialog_scanner);
        scannerDialog.findViewById(R.id.btnFace).setOnClickListener(faceListener);
        scannerDialog.findViewById(R.id.btnQRCode).setOnClickListener(qrcodeListener);
    }
    @Override
    public int initContentView() {
        return R.layout.fragment_maincontent;
    }

    @Override
    public void setupSpaceNavigationView(SpaceOnClickListener spaceOnClickListener) {
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_pin_drop_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_library_books_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_wb_cloudy_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_insert_chart_black_24dp));
        spaceNavigationView.setSpaceOnClickListener(spaceOnClickListener);
    }


    @Override
    public void gotoStatisticFragment() {
        Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new StatisticController()).withBackStack(false).commit();
    }

    @Override
    public void gotoMemoFragment() {
        Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new MemoController()).withBackStack(false).commit();
    }

    @Override
    public void gotoWeatherFragment() {
        Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new WeatherController()).withBackStack(false).commit();
    }

    @Override
    public void gotoFeedFragment() {
        Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new FeedController()).withBackStack(false).commit();
    }

    @Override
    public void gotoProfileFragment() {
        Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new ProfileController()).withBackStack(true).commit();
    }

    @Override
    public void showScannerOptionDialog() {
        scannerDialog.show();
    }
}
