package pocketcoder.idnijuan.business.module.activity.scanner.qrcode;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QRCodePresenter implements QRCodeContract.Presenter {
    @NonNull private QRCodeContract.ViewMethod viewMethod;

}
