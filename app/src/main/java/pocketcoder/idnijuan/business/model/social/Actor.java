
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Actor {

    @SerializedName("displayName")
    private String mDisplayName;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("url")
    private String mUrl;

}
