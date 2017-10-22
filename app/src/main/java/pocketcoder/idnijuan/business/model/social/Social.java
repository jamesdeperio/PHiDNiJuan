
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Social {

    @SerializedName("items")
    private List<Item> mItems;

}
