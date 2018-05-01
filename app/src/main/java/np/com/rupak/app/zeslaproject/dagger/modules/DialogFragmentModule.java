package np.com.rupak.app.zeslaproject.dagger.modules;

/**
 * Created by Rupak on 12/19/2016.
 */

import android.app.DialogFragment;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerDialogFragment;

/**
 * Provides fragment level of instances.
 * Everything define here can be injected at every fragment.
 * @author Rupak Adhikari
 */
@Module
public class DialogFragmentModule {

    private DialogFragment mFragment;

    public DialogFragmentModule(DialogFragment fragment) {
        mFragment = fragment;
    }

    /**
     *
      * @return Fragment
     */
    @Provides
    DialogFragment provideFragment() {
        return mFragment;
    }

    /**
     *
     * @return Fragment's Activity
     */
    @Provides
    @PerDialogFragment
    Context providesContext() {
        return mFragment.getActivity();
    }





   /* @Provides
    @PerFragment
    TaskListAdapter providesTaskListAdapter(Context c) {
        return new TaskListAdapter(c);
    }*/





}
