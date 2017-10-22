
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class WeatherForeCast {

    @SerializedName("query")
    private Query mQuery;

}
