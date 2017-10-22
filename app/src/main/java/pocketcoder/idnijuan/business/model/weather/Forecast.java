
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Forecast {

    @SerializedName("code")
    private String mCode;
    @SerializedName("date")
    private String mDate;
    @SerializedName("day")
    private String mDay;
    @SerializedName("high")
    private String mHigh;
    @SerializedName("low")
    private String mLow;
    @SerializedName("text")
    private String mText;

}
