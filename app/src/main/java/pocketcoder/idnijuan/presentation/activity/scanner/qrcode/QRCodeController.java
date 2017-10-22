package pocketcoder.idnijuan.presentation.activity.scanner.qrcode;

import android.os.Bundle;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.module.activity.scanner.qrcode.QRCodeContract;


public class QRCodeController extends QRCodeView implements QRCodeContract.Event {
    @Inject QRCodeContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {

    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }
}
