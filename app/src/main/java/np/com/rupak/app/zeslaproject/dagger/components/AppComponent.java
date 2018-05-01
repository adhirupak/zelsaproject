package np.com.rupak.app.zeslaproject.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import np.com.rupak.app.zeslaproject.app.ZelsaApp;
import np.com.rupak.app.zeslaproject.dagger.modules.ApiModule;
import np.com.rupak.app.zeslaproject.dagger.modules.AppModule;
import np.com.rupak.app.zeslaproject.dagger.modules.NetModule;
import np.com.rupak.app.zeslaproject.networking.ApiInterface;
import np.com.rupak.app.zeslaproject.realm.RealmDatabase;


/**
 * Created by HP on 10/3/2016.
 */
@Singleton
@Component(modules={AppModule.class, NetModule.class, ApiModule.class})
public interface AppComponent {
    ApiInterface apiInterface(); //provided to subcomponents
    RealmDatabase database();
    void inject(ZelsaApp application);

}
