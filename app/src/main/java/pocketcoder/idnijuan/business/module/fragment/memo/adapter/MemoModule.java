package pocketcoder.idnijuan.business.module.fragment.memo.adapter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.service.NetworkService;
import pocketcoder.idnijuan.presentation.fragment.memo.MemoController;

@Module
public abstract class MemoModule {
    @Binds public abstract MemoContract.ViewMethod bindsViewMethod(MemoController controller);
    @FragmentScope @Provides
    public static MemoContract.Presenter providesPresenter(MemoContract.ViewMethod viewMethod, NetworkService networkService) {
        return new MemoPresenter(viewMethod,networkService.getMemoService());
    }
}