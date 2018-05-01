package np.com.rupak.app.zeslaproject.ui.main;

import javax.inject.Inject;

import np.com.rupak.app.zeslaproject.ui.base.BasePresenter;

/**
 * Created by rupak on 5/1/18.
 */

public class MainActivityPresenter extends BasePresenter<MainMvpView> {

    @Inject
    MainActivityPresenter(){}

    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }


    /**
     * Handling of message like parsing,saving is done from here.
     * And Update UI is from here
     * @param text
     */
    public void handleMessage(String text) {
        /**
         * after handling update ui from here
         */
        getMvpView().updateUI();
    }
}
