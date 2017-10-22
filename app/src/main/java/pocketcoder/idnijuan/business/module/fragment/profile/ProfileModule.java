package pocketcoder.idnijuan.business.module.fragment.profile;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.idnijuan.business.scope.FragmentScope;
import pocketcoder.idnijuan.integration.dao.table.DaoSession;
import pocketcoder.idnijuan.presentation.fragment.profile.ProfileController;

@Module
public abstract class ProfileModule {
    @Binds public abstract ProfileContract.ViewMethod bindsViewMethod(ProfileController controller);

    @FragmentScope
    @Provides
    public static ProfileContract.Presenter providesPresenter(ProfileContract.ViewMethod viewMethod, DaoSession daoSession) {
        
        return new ProfilePresenter(viewMethod,daoSession.getAccountTableDao());
    }
}
