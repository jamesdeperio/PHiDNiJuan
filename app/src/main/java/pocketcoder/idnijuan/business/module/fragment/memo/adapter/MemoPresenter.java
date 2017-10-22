package pocketcoder.idnijuan.business.module.fragment.memo.adapter;

import android.graphics.Color;
import android.os.StrictMode;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import me.ithebk.barchart.BarChart;
import me.ithebk.barchart.BarChartModel;
import pocketcoder.idnijuan.business.model.memo.Country;
import pocketcoder.idnijuan.business.model.memo.Memo;
import pocketcoder.idnijuan.business.model.memo.Population;
import pocketcoder.idnijuan.integration.memo.MemoService;

@RequiredArgsConstructor
public class MemoPresenter implements  MemoContract.Presenter {
    @NonNull private MemoContract.ViewMethod viewMethod;
    @NonNull private MemoService service;

    @Override
    public void loadGraphList(TextView tvPopulation, BarChart barChart, BarChart barChartOFW) {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            List<Memo> memoList = service.getMemo().execute().body().getJobcategories();
            List<Country> ofwMemos = service.getMemoOFW().execute().body().getMCountries();
            List<Population> populations = service.getPopulation().execute().body().getMPopulation();
            tvPopulation.setText(populations.get(0).getMTotal()+" People");
            int x=0;
            int y=0;
            for (Memo memo:memoList) {
                if (x<Integer.parseInt(memo.getResult())) x=Integer.parseInt(memo.getResult());
            }
            for (Country country:ofwMemos) {
                if (y<Integer.parseInt(country.getMResult())) y=Integer.parseInt(country.getMResult());
            }
            barChart.setBarMaxValue(x*5);
            barChartOFW.setBarMaxValue(x*5);
            for (Memo memo:memoList){
                BarChartModel barChartModel = new BarChartModel();
                barChartModel.setBarValue(Integer.parseInt(memo.getResult()));
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                barChartModel.setBarColor(color);
                barChartModel.setBarTag(null);
                barChartModel.setBarText(memo.getJobcategory()+"("+memo.getResult()+")");
                barChart.addBar(barChartModel);
            }

            for (Country country:ofwMemos){
                BarChartModel barChartModel = new BarChartModel();
                barChartModel.setBarValue(Integer.parseInt(country.getMResult()));
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                barChartModel.setBarColor(color);
                barChartModel.setBarTag(null);
                barChartModel.setBarText(country.getMCountry()+"("+country.getMResult()+")");
                barChartOFW.addBar(barChartModel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
