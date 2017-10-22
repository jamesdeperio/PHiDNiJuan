
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Image {

    @SerializedName("height")
    private String mHeight;
    @SerializedName("link")
    private String mLink;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("width")
    private String mWidth;

}
