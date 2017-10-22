package pocketcoder.idnijuan.business.model.memo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

/**
 * Created by Gabriel on 10/21/2017.
 */

@Data
public class MemoList {
    @SerializedName("jobcategories")
    private List<Memo> jobcategories;

}
