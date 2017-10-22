
package pocketcoder.idnijuan.business.model.social;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Object {

    @SerializedName("attachments")
    private List<Attachment> mAttachments;
    @SerializedName("content")
    private String mContent;

}
