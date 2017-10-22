package pocketcoder.idnijuan.business.module.fragment.maincontent;

import android.view.View;

import com.luseen.spacenavigation.SpaceOnClickListener;

public interface MainContentContract {
    interface Event {
        void scannerQRCODEDialogEvent(View view);
        void scannerFacRecognitionDialogEvent(View view);
        void profileEvent();
    }
    interface ViewMethod {
        void setQrcodeListener(View.OnClickListener view);
        void setFaceListener(View.OnClickListener view);
        void setupSpaceNavigationView(SpaceOnClickListener spaceOnClickListener);
        void gotoStatisticFragment();
        void gotoMemoFragment();
        void gotoWeatherFragment();
        void gotoFeedFragment();
        void gotoProfileFragment();
        void showScannerOptionDialog();
    }

    interface Presenter {

    }
}
