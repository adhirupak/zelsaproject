package np.com.rupak.app.zeslaproject.app;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import javax.inject.Inject;

import np.com.rupak.app.zeslaproject.dagger.Injector;
import np.com.rupak.app.zeslaproject.realm.RealmDatabase;

/**
 * Created by rupak on 5/1/18.
 */

public class ZelsaApp extends Application {
    @Inject
    RealmDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.initializeApplicationComponent(this);
        Injector.getAppComponent().inject(this);
        database.setup();
        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                .build());
    }
}
