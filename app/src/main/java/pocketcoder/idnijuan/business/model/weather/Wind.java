
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Wind {

    @SerializedName("chill")
    private String mChill;
    @SerializedName("direction")
    private String mDirection;
    @SerializedName("speed")
    private String mSpeed;

}
