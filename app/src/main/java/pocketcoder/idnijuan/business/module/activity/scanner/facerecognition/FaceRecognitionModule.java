package pocketcoder.idnijuan.business.module.activity.scanner.facerecognition;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.component.DaggerFacialRecognitionAdapterComponent;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapterModule;
import pocketcoder.idnijuan.business.scope.ActivityScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.FaceRecognitionController;

@Module
public abstract class FaceRecognitionModule {
    @Binds public abstract FaceRecognitionContract.ViewMethod bindsViewMethod(FaceRecognitionController controller);
    @ActivityScope @Provides
    public static FaceRecognitionContract.Presenter providesPresenter(FaceRecognitionContract.ViewMethod viewMethod, NetworkService networkService) {
        FaceRecognitionPresenter presenter= new FaceRecognitionPresenter(viewMethod,networkService.getService());
        DaggerFacialRecognitionAdapterComponent.builder().faceRecognitionAdapterModule(new FaceRecognitionAdapterModule(viewMethod)).build().inject(presenter);
        return presenter;
    }
}
