package pocketcoder.idnijuan.integration.memo;

import pocketcoder.idnijuan.business.model.memo.MemoList;
import pocketcoder.idnijuan.business.model.memo.OFWMemo;
import pocketcoder.idnijuan.business.model.memo.Population;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gabriel on 10/21/2017.
 */

public interface MemoService {


    @GET("statisticsJobs.php")
    Call<MemoList> getMemo();

    @GET("population.php")
    Call<Population> getPopulation();

    @GET("statisticsOFW.php")
    Call<OFWMemo> getMemoOFW();

}
