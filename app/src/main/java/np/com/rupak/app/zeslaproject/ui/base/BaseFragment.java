package np.com.rupak.app.zeslaproject.ui.base;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;

import np.com.rupak.app.zeslaproject.R;
import np.com.rupak.app.zeslaproject.dagger.Injector;
import np.com.rupak.app.zeslaproject.dagger.components.FragmentComponent;


/**
 * Created by Dell on 10/18/2016.
 */
public class BaseFragment extends Fragment {


    private ProgressDialog mProgressDialog;

    public FragmentComponent getFragmentComponent(){
        Injector.initialiseFragmentComponent(this);
        return Injector.getFragmentComponent();
    }




}
