package pocketcoder.idnijuan.presentation.fragment.maincontent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.luseen.spacenavigation.SpaceOnClickListener;

import javax.inject.Inject;

import jamesdeperio.github.com.codepocket.util.Navigate;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.maincontent.MainContentContract;
import pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.FaceRecognitionController;
import pocketcoder.idnijuan.presentation.fragment.statistic.StatisticController;

public class MainContentController extends MainContentView implements MainContentContract.Event, SpaceOnClickListener {
    @Inject MainContentContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {
        getActivity().runOnUiThread(()->{
            setupSpaceNavigationView(this);
            setFaceListener(this::scannerFacRecognitionDialogEvent);
            setQrcodeListener(this::scannerQRCODEDialogEvent);
            createScannerDialog();
            Navigate.INSTANCE.change(R.id.mainFrame).from(this).to(new StatisticController()).withBackStack(false).commit();

        });
    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }


    @Override
    public void onCentreButtonClick() {
        getActivity().startActivity(new Intent(getContext(), FaceRecognitionController.class));
    }

    @Override
    public void onItemClick(int itemIndex, String itemName) {
        switch (itemIndex){
            case 0: getActivity().runOnUiThread(this::gotoStatisticFragment); break;
            case 1: getActivity().runOnUiThread(this::gotoFeedFragment); break;
            case 2: getActivity().runOnUiThread(this::gotoWeatherFragment);  break;
            case 3: getActivity().runOnUiThread(this::gotoMemoFragment); break;
        }
    }

    @Override
    public void onItemReselected(int itemIndex, String itemName) {

    }

    @Override
    public void scannerQRCODEDialogEvent(View view) {

    }

    @Override
    public void scannerFacRecognitionDialogEvent(View view) {
        getActivity().startActivity(new Intent(getContext(), FaceRecognitionController.class));

    }

    @Override
    public void profileEvent() {

    }

}
