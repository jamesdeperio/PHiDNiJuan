package pocketcoder.idnijuan.business.model.karios;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;
import pocketcoder.idnijuan.business.model.karios.success.Image;

@Data
public class KariosResponse {
    @SerializedName("images")
    private List<Image> images;
    @SerializedName("Errors")
    private List<Error> errors;
}
