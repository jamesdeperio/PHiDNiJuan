package pocketcoder.idnijuan.integration.service.social;

import pocketcoder.idnijuan.business.model.social.Social;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.integration.service.social
 */

public interface SocialService {
    @GET("hashtag.php")
    Call<Social> getSocial();
}
