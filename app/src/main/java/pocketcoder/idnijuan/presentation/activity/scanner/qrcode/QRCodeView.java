package pocketcoder.idnijuan.presentation.activity.scanner.qrcode;

import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.scanner.qrcode.QRCodeContract;
import pocketcoder.idnijuan.presentation.base.DIBaseActivity;


public abstract class QRCodeView extends DIBaseActivity implements QRCodeContract.ViewMethod {
    @Override
    public int initContentView() {
        return R.layout.activity_qrcode;
    }
}
