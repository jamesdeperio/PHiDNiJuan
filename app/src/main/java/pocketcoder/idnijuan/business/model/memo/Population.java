
package pocketcoder.idnijuan.business.model.memo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Population {

    @SerializedName("population")
    private List<Population> mPopulation;
    @SerializedName("total")
    private String mTotal;

}
