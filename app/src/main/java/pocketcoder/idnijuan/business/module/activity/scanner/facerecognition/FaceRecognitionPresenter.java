package pocketcoder.idnijuan.business.module.activity.scanner.facerecognition;

import android.os.StrictMode;

import java.io.IOException;

import javax.inject.Inject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapter;
import pocketcoder.idnijuan.integration.service.face.ProfilesService;

@RequiredArgsConstructor
public class FaceRecognitionPresenter implements FaceRecognitionContract.Presenter {
    @NonNull private FaceRecognitionContract.ViewMethod viewMethod;
    @NonNull private ProfilesService service;
   @Inject FaceRecognitionAdapter adapter;

    @Override
    public FaceRecognitionAdapter getAdapter() {
        return adapter;
    }

    @Override
    public void postRFID(String res) {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            adapter.setFilterfaceList(service.getFace(res).execute().body().getMFaces());
            adapter.setFaceList(adapter.getFilterfaceList());
            adapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}
