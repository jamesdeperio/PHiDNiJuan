
package pocketcoder.idnijuan.business.model.face;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Faces {

    @SerializedName("faces")
    private List<Face> mFaces;
}
