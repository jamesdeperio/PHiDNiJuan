
package pocketcoder.idnijuan.business.model.karios.success;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

@Data
public class Image {
    @SerializedName("candidates")
    private List<Candidate> candidates;
    @SerializedName("transaction")
    private Transaction transaction;
}
