
package pocketcoder.idnijuan.business.model.weather;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Query {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("created")
    private String mCreated;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("results")
    private Results mResults;

}
