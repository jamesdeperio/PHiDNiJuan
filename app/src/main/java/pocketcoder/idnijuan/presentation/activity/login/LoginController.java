package pocketcoder.idnijuan.presentation.activity.login;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.google.zxing.Result;

import javax.inject.Inject;

import butterknife.OnClick;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.login.LoginContract;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
public class LoginController extends LoginView implements LoginContract.Event, ZXingScannerView.ResultHandler {
    @Inject LoginContract.Presenter presenter;
    private static final int MY_PERMISSION_REQUEST_CAMERA = 0;
    private ZXingScannerView mScannerView;

    @Override
    public void initialization(Bundle bundle) {
        if (!(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED)) {
            requestCameraPermission();
        }else {
            mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
            setContentView(mScannerView);
            mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
            mScannerView.startCamera();         // Start camera
        }
    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }
    @Override
    public void requestCameraPermission() {
        ActivityCompat.requestPermissions(this, new String[] {
                Manifest.permission.CAMERA
        }, MY_PERMISSION_REQUEST_CAMERA);
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }
    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
        // Do something with the result here

        Log.e("handler", rawResult.getText()); // Prints scan results
        Log.e("handler", rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode)
}

    @OnClick(R.id.btnLogin) void login() {
     }

}
