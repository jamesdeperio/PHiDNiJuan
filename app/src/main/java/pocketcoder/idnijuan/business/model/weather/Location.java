
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Location {

    @SerializedName("city")
    private String mCity;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("region")
    private String mRegion;

}
