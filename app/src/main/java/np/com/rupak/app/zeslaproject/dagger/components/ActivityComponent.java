package np.com.rupak.app.zeslaproject.dagger.components;

import dagger.Component;
import np.com.rupak.app.zeslaproject.dagger.modules.ActivityModule;
import np.com.rupak.app.zeslaproject.dagger.modules.RealmModule;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerActivity;


/**
 * Created by HP on 10/22/2016.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, RealmModule.class})
public interface ActivityComponent {


}

