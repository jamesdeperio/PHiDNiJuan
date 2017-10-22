package pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionContract;

/**
 * Created by jamesdeperio on 9/20/2017
 * ph.nyxsys.cmbfilminventory.business.module.screen.loader
 */
@Module
public class FaceRecognitionAdapterModule {

    private FaceRecognitionContract.ViewMethod viewMethod;

    public FaceRecognitionAdapterModule(FaceRecognitionContract.ViewMethod viewMethod){
        this.viewMethod=viewMethod;
    }

    @Singleton
    @Provides
    public FaceRecognitionContract.ViewMethod providesView(){
        return viewMethod;
    }
    @Singleton
    @Provides
    public FaceRecognitionAdapter providesAdapter(FaceRecognitionContract.ViewMethod viewMethod){
        return new FaceRecognitionAdapter(viewMethod);
    }
}
