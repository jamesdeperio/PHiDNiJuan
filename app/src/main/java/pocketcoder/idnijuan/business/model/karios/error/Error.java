
package pocketcoder.idnijuan.business.model.karios.error;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Error {
    @SerializedName("Message")
    private String message;
}
