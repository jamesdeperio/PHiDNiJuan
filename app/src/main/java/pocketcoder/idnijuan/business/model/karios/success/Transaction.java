
package pocketcoder.idnijuan.business.model.karios.success;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Transaction {
    @SerializedName("status")
    private String status;
}
