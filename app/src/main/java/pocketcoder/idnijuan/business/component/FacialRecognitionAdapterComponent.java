package pocketcoder.idnijuan.business.component;

import javax.inject.Singleton;

import dagger.Component;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionPresenter;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapterModule;

/**
 * Created by jamesdeperio on 09/22/2017.
 * ph.nyxsys.cmbfilminventory.integration.service
 */
@Singleton
@Component(modules = {FaceRecognitionAdapterModule.class})
public interface FacialRecognitionAdapterComponent {
    void inject(FaceRecognitionPresenter presenter);
}
