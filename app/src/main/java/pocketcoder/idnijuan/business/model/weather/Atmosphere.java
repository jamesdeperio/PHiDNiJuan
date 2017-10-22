
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Atmosphere {

    @SerializedName("humidity")
    private String mHumidity;
    @SerializedName("pressure")
    private String mPressure;
    @SerializedName("rising")
    private String mRising;
    @SerializedName("visibility")
    private String mVisibility;

}
