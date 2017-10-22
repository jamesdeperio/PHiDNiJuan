
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Image {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("width")
    private Long mWidth;

}
