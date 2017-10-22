
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Channel {

    @SerializedName("astronomy")
    private Astronomy mAstronomy;
    @SerializedName("atmosphere")
    private Atmosphere mAtmosphere;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("item")
    private Item mItem;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("lastBuildDate")
    private String mLastBuildDate;
    @SerializedName("link")
    private String mLink;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("ttl")
    private String mTtl;
    @SerializedName("units")
    private Units mUnits;
    @SerializedName("wind")
    private Wind mWind;

}
