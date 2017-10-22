package pocketcoder.idnijuan.business.module.injector;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import pocketcoder.idnijuan.business.module.activity.loader.LoaderModule;
import pocketcoder.idnijuan.business.module.activity.login.LoginModule;
import pocketcoder.idnijuan.business.module.activity.main.MainModule;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionModule;
import pocketcoder.idnijuan.business.module.activity.scanner.qrcode.QRCodeModule;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.presentation.activity.loader.LoaderController;
import pocketcoder.idnijuan.presentation.activity.login.LoginController;
import pocketcoder.idnijuan.presentation.activity.main.MainController;
import pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.FaceRecognitionController;
import pocketcoder.idnijuan.presentation.activity.scanner.qrcode.QRCodeController;


@Module(includes = AndroidInjectionModule.class)
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = LoaderModule.class)
    abstract LoaderController loaderControllerInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginController loginControllerInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainController mainControllerInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = FaceRecognitionModule.class)
    abstract FaceRecognitionController faceRecognitionControllerInjector();


    @ActivityScope
    @ContributesAndroidInjector(modules = QRCodeModule.class)
    abstract QRCodeController qrCodeControllerInjector();

}
