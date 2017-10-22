package pocketcoder.idnijuan.integration.service.face;

import pocketcoder.idnijuan.business.model.face.Faces;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Streaming;

/**
 * Created by jamesdeperio on 10/21/2017
 * pocketcoder.idnijuan.integration.service.face
 */

public interface ProfilesService {
    @FormUrlEncoded
    @Streaming
    @POST("getfaces.php")
    Call<Faces> getFace(@Field("data") String data);
}
