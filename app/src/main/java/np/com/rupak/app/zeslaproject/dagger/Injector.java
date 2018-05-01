package np.com.rupak.app.zeslaproject.dagger;


import np.com.rupak.app.zeslaproject.app.ZelsaApp;
import np.com.rupak.app.zeslaproject.dagger.components.ActivityComponent;
import np.com.rupak.app.zeslaproject.dagger.components.AppComponent;
import np.com.rupak.app.zeslaproject.dagger.components.DaggerActivityComponent;
import np.com.rupak.app.zeslaproject.dagger.components.DaggerAppComponent;
import np.com.rupak.app.zeslaproject.dagger.components.DaggerFragmentComponent;
import np.com.rupak.app.zeslaproject.dagger.components.DialogFragmentComponent;
import np.com.rupak.app.zeslaproject.dagger.components.FragmentComponent;
import np.com.rupak.app.zeslaproject.dagger.modules.ActivityModule;
import np.com.rupak.app.zeslaproject.dagger.modules.ApiModule;
import np.com.rupak.app.zeslaproject.dagger.modules.AppModule;
import np.com.rupak.app.zeslaproject.dagger.modules.FragmentModule;
import np.com.rupak.app.zeslaproject.dagger.modules.NetModule;
import np.com.rupak.app.zeslaproject.dagger.modules.RealmModule;
import np.com.rupak.app.zeslaproject.ui.base.BaseActivity;
import np.com.rupak.app.zeslaproject.ui.base.BaseFragment;

/**
 * Created by Dell on 10/5/2016.
 */
public class Injector {

    private static AppComponent mAppComponent;
    private static ActivityComponent mActivityComponent;
    private static FragmentComponent mFragmentComponent;
    private static DialogFragmentComponent dialogFragmentComponent;

    private Injector() {}

    public static void initializeApplicationComponent(ZelsaApp application) {
        mAppComponent = DaggerAppComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(application))
                .netModule(new NetModule(application, ""))
                .apiModule(new ApiModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static void initialiseActivityComponent(BaseActivity activity) {
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(getAppComponent())
                // list of modules that are part of this component need to be created here too
                .activityModule(new ActivityModule(activity))
                .realmModule(new RealmModule())
                .build();
    }

    public static ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    public static void initialiseFragmentComponent(BaseFragment fragment) {
        mFragmentComponent = DaggerFragmentComponent.builder()
                .appComponent(getAppComponent())
                // list of modules that are part of this component need to be created here too
                .fragmentModule(new FragmentModule(fragment))
                .build();
    }



    public static FragmentComponent getFragmentComponent() {
        return mFragmentComponent;
    }

    public static DialogFragmentComponent getDialogFragmentComponent(){
        return dialogFragmentComponent;
    }


}
