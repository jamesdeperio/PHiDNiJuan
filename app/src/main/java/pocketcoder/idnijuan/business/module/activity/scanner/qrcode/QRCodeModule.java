package pocketcoder.idnijuan.business.module.activity.scanner.qrcode;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.activity.scanner.qrcode.QRCodeController;

@Module
public abstract class QRCodeModule {
    @Binds public abstract QRCodeContract.ViewMethod bindsViewMethod(QRCodeController controller);
    @ActivityScope @Provides
    public static QRCodeContract.Presenter providesPresenter(QRCodeContract.ViewMethod viewMethod, NetworkService networkService) {
        return new QRCodePresenter(viewMethod);
    }
}
