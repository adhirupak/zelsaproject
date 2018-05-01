package np.com.rupak.app.zeslaproject.dagger.components;

import dagger.Component;
import np.com.rupak.app.zeslaproject.dagger.modules.DialogFragmentModule;
import np.com.rupak.app.zeslaproject.dagger.modules.RealmModule;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerDialogFragment;

;

/**
 * Created by AM Nepal on 5/23/2017.
 */
@PerDialogFragment
@Component(dependencies = AppComponent.class, modules = {DialogFragmentModule.class, RealmModule.class  })
public interface DialogFragmentComponent {

}
