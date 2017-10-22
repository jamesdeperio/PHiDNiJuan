package pocketcoder.idnijuan.presentation.fragment.weather;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import jamesdeperio.github.com.codepocket.helper.layoutmanager.RecyclerLinearLayoutManager;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.weather.WeatherContract;
import pocketcoder.idnijuan.presentation.base.DIBaseFragment;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;

public abstract class WeatherView extends DIBaseFragment implements WeatherContract.ViewMethod {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public int initContentView() {
        return R.layout.fragment_weather;
    }

    @Override
    public FragmentActivity getFragmentActivity() {
        return getActivity();
    }

    @Override
    public void initRecyclerView(PocketAdapter adapter) {

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager( new RecyclerLinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
    }
}
