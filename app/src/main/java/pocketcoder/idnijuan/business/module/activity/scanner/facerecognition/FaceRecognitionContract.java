package pocketcoder.idnijuan.business.module.activity.scanner.facerecognition;

import android.app.Activity;

import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapter;

public interface FaceRecognitionContract {
    interface Event {

    }
    interface ViewMethod {
        void initRecyclerView(FaceRecognitionAdapter pocketAdapter);
        Activity getFragmentActivity();
    }
    interface Presenter {
        FaceRecognitionAdapter getAdapter();
        void postRFID(String res);
 }
}
