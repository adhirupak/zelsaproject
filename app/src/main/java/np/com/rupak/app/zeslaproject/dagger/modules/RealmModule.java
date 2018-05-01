package np.com.rupak.app.zeslaproject.dagger.modules;

import dagger.Module;
import dagger.Provides;
import np.com.rupak.app.zeslaproject.dagger.scopes.PerActivity;
import np.com.rupak.app.zeslaproject.realm.RealmDatabase;
import np.com.rupak.app.zeslaproject.realm.RealmRepository;


/**
 * Created by Dell on 10/4/2016.
 */

@Module
public class RealmModule {

    @Provides
    @PerActivity
    RealmRepository providesRealmRepository(RealmDatabase database) {
        return new RealmRepository(database);
    }
}
