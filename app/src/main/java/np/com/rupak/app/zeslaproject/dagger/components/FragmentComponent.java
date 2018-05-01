package np.com.rupak.app.zeslaproject.dagger.components;


import dagger.Component;
import np.com.rupak.app.zeslaproject.dagger.modules.DialogFragmentModule;
import np.com.rupak.app.zeslaproject.dagger.modules.FragmentModule;
import np.com.rupak.app.zeslaproject.dagger.modules.RealmModule;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerFragment;


/**
 * Created by HP on 10/22/2016.
 */

@PerFragment
@Component(dependencies = AppComponent.class, modules = {FragmentModule.class, RealmModule.class , DialogFragmentModule.class})
public interface FragmentComponent {

}

