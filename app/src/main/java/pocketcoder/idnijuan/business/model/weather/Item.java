
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Item {

    @SerializedName("condition")
    private Condition mCondition;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("forecast")
    private List<Forecast> mForecast;
    @SerializedName("guid")
    private Guid mGuid;
    @SerializedName("lat")
    private String mLat;
    @SerializedName("link")
    private String mLink;
    @SerializedName("long")
    private String mLong;
    @SerializedName("pubDate")
    private String mPubDate;
    @SerializedName("title")
    private String mTitle;

}
