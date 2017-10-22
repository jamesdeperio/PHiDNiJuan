
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Results {

    @SerializedName("channel")
    private Channel mChannel;

}
