package pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.viewholder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionContract;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.adapter.FaceRecognitionAdapter;
import pocketcoder.idnijuan.presentation.base.adapter.PocketViewHolder;

/**
 * Created by jamesdeperio on 10/21/2017
 * pocketcoder.idnijuan.presentation.activity.scanner.facerecognition.viewholder
 */
@RequiredArgsConstructor
public class FaceRecognitionViewHolder extends PocketViewHolder {
    @NonNull private FaceRecognitionAdapter adapter;
    @NonNull private FaceRecognitionContract.ViewMethod viewMethod;
    @Override
    public int initContentView() {
        return R.layout.list_facerecognition;
    }

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.occupation)
    TextView occupation;

    @BindView(R.id.email)
    TextView email;

    @BindView(R.id.bry)
    TextView bry;


    @BindView(R.id.city)
    TextView city;


    @Override
    public void onBindEvent(View view, int i) {
        name.setText(adapter.getFaceList().get(i).getMFname()+" " +adapter.getFaceList().get(i).getMMname() + " " + adapter.getFaceList().get(i).getMLname() );
        occupation.setText(adapter.getFaceList().get(i).getMOccupation());
        email.setText(adapter.getFaceList().get(i).getMEmail());
        bry.setText(adapter.getFaceList().get(i).getMBry());
        city.setText(adapter.getFaceList().get(i).getMCity());
        Log.i( "onBindEvent: ",adapter.getFaceList().get(i).getMFname());
    }
}
