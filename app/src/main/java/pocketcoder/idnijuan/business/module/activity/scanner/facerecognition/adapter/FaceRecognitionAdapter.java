package pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import pocketcoder.idnijuan.business.model.face.Face;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionContract;
import pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.viewholder.FaceRecognitionViewHolder;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;
/**
 * Created by jamesdeperio on 10/21/2017
 * pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter
 */

public class FaceRecognitionAdapter extends PocketAdapter {
     @Getter @Setter private List<Face> faceList = new ArrayList<>();
     @Getter @Setter private List<Face> filterfaceList = new ArrayList<>();
    public FaceRecognitionAdapter(FaceRecognitionContract.ViewMethod viewMethod){
        addViewHolder(new FaceRecognitionViewHolder(this,viewMethod));
    }

    @Override
    public int getDataCount() {
        return faceList.size();
    }
}
