package np.com.rupak.app.zeslaproject.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import np.com.rupak.app.zeslaproject.dagger.Injector;
import np.com.rupak.app.zeslaproject.dagger.components.ActivityComponent;


/**
 * Created by Dell on 10/18/2016.
 */
public class BaseActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.initialiseActivityComponent(this);
    }


    public ActivityComponent getActivityComponent() {
        return Injector.getActivityComponent();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        View view = getCurrentFocus();
        boolean ret = super.dispatchTouchEvent(event);
        return ret;
    }

}
