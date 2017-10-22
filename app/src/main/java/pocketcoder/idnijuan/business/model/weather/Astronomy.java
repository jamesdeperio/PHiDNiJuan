
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Astronomy {

    @SerializedName("sunrise")
    private String mSunrise;
    @SerializedName("sunset")
    private String mSunset;

}
