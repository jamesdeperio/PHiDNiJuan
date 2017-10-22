package pocketcoder.idnijuan.business.model.memo;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Gabriel on 10/21/2017.
 */
@Data
public class Memo {

    @SerializedName("jobcategory")
    private String jobcategory;

    @SerializedName("result")
    private String result;

}