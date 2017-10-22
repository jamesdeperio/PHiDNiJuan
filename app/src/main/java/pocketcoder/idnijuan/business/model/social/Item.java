
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Item {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("published")
    private String mPublished;
    @SerializedName("actor")
    private Actor mActor;
    @SerializedName("object")
    private Object mObject;

}
