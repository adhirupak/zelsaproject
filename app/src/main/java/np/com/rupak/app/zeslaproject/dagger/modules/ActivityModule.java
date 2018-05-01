package np.com.rupak.app.zeslaproject.dagger.modules;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;


/**
 * Created by HP on 10/22/2016.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    Context providesContext() {
        return mActivity;
    }


}