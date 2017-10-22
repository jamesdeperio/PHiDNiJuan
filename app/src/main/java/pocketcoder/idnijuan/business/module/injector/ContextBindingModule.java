package pocketcoder.idnijuan.business.module.injector;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ContextBindingModule {
    @Binds abstract Context bindContext(Application application);
}
