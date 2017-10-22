
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Units {

    @SerializedName("distance")
    private String mDistance;
    @SerializedName("pressure")
    private String mPressure;
    @SerializedName("speed")
    private String mSpeed;
    @SerializedName("temperature")
    private String mTemperature;

}
