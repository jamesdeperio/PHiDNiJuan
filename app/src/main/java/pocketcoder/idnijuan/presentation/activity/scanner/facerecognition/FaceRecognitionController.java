package pocketcoder.idnijuan.presentation.activity.scanner.facerecognition;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Base64;
import android.util.Log;

import com.google.gson.Gson;
import com.kairos.Kairos;
import com.kairos.KairosListener;

import org.json.JSONException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.inject.Inject;

import pocketcoder.idnijuan.business.model.karios.KariosResponse;
import pocketcoder.idnijuan.business.model.karios.success.Candidate;
import pocketcoder.idnijuan.business.module.activity.scanner.facerecognition.FaceRecognitionContract;


public class FaceRecognitionController extends FaceRecognitionView implements FaceRecognitionContract.Event,KairosListener {
    @Inject FaceRecognitionContract.Presenter presenter;
    private Kairos kairos=new Kairos();
    String app_id = "7e274171";
    String api_key = "b528e699fd29afe33c1bc552b24854a3";
    private static final int MY_PERMISSION_REQUEST_CAMERA = 0;
    private static final int CAMERA_REQUEST = 1888;

    @Override
    public void initialization(Bundle bundle) {
        initRecyclerView(presenter.getAdapter());
        kairos.setAuthentication(this, app_id, api_key);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent, CAMERA_REQUEST);

        } else {
            requestCameraPermission();
             }
    }

    private void requestCameraPermission() {
        ActivityCompat.requestPermissions(this, new String[] {
                Manifest.permission.CAMERA
        }, MY_PERMISSION_REQUEST_CAMERA);

    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            recognizedFace(getEncoded64ImageStringFromBitmap(photo));
        }
    }

    private void enrollFace(String image) {

        String subjectId = "jdp1";
        String galleryId = "MYapplication";
        try {
            kairos.enroll(image, subjectId, galleryId, null, null, null, this);
        } catch (JSONException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    private void recognizedFace(String image) {
        String galleryId = "MYapplication";
        try {
            kairos.recognize(image, galleryId, null, null, null, null, this);
        } catch (IOException |JSONException e) {
            e.printStackTrace();
        }
    }
    public String getEncoded64ImageStringFromBitmap(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream);
        byte[] byteFormat = stream.toByteArray();
        return  Base64.encodeToString(byteFormat, Base64.NO_WRAP);
    }
    @Override
    public void onSuccess(String s) {
        Gson gson = new Gson();
        KariosResponse response= gson.fromJson(s,KariosResponse.class);
        Log.e("onSuccess: ",response.toString());
        if (response.getImages()!=null){
            int position=0;
           String res="";
            try{
                for(Candidate candidate:response.getImages().get(0).getCandidates()){
                    res=res+"'"+candidate.getSubjectId()+"'";
                    if (position>0 && position!=response.getImages().get(0).getCandidates().size())
                        res=res+",";
                    position++;
                }
                Log.e("onSuccess: ",res);
                presenter.postRFID(res);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFail(String s) {

    }



}
