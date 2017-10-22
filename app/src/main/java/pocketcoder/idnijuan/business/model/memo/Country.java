
package pocketcoder.idnijuan.business.model.memo;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Country {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("result")
    private String mResult;
}
