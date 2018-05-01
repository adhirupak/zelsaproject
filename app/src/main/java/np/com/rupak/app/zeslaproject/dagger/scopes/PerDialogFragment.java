package np.com.rupak.app.zeslaproject.dagger.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by AM Nepal on 5/23/2017.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerDialogFragment {
}