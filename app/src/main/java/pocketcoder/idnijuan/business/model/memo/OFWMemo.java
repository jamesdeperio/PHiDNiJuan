
package pocketcoder.idnijuan.business.model.memo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class OFWMemo {

    @SerializedName("countries")
    private List<Country> mCountries;
}
