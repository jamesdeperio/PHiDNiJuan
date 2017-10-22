
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Condition {

    @SerializedName("code")
    private String mCode;
    @SerializedName("date")
    private String mDate;
    @SerializedName("temp")
    private String mTemp;
    @SerializedName("text")
    private String mText;

}
