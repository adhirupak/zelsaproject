package np.com.rupak.app.zeslaproject.realm;

import io.realm.Realm;

/**
 * Created by Dell on 10/5/2016.
 */
public class RealmRepository {

    RealmDatabase database;
    Realm realm;
    public RealmRepository(RealmDatabase database){
        this.database=database;
        this.realm = database.getRealmInstance();
    }


}
