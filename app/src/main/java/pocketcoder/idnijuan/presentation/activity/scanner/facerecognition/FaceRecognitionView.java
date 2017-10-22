package pocketcoder.idnijuan.presentation.activity.scanner.facerecognition;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import jamesdeperio.github.com.codepocket.helper.layoutmanager.RecyclerLinearLayoutManager;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.model.face.Face;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionContract;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapter;
import pocketcoder.idnijuan.presentation.base.DIBaseActivity;


public abstract class FaceRecognitionView extends DIBaseActivity implements FaceRecognitionContract.ViewMethod {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @Override
    public int initContentView() {
        return R.layout.activity_facerecognition;
    }

    @Override
    public void initRecyclerView(FaceRecognitionAdapter pocketAdapter) {
        Face face= new Face();
        face.setMFname("jamesssss");
        recyclerView.setAdapter(pocketAdapter);
        recyclerView.setLayoutManager(new RecyclerLinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }

    @Override
    public Activity getFragmentActivity() {
        return this;
    }
}
