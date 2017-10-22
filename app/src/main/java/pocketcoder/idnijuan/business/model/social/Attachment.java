
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Attachment {
    @SerializedName("url")
    private String mUrl;

    @SerializedName("image")
    private Attach image;


}
