package np.com.rupak.app.zeslaproject.dagger.modules;

/**
 * Created by HP on 12/19/2016.
 */

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerFragment;


@Module
public class FragmentModule {

    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @Provides
    Fragment provideFragment() {
        return mFragment;
    }

    @Provides
    @PerFragment
    Context providesContext() {
        return mFragment.getContext();
    }






}
