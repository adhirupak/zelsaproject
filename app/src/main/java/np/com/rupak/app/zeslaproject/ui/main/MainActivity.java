package np.com.rupak.app.zeslaproject.ui.main;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import np.com.rupak.app.zeslaproject.R;
import np.com.rupak.app.zeslaproject.common.Constant;
import np.com.rupak.app.zeslaproject.networking.WebSocketClient;
import np.com.rupak.app.zeslaproject.ui.base.BaseActivity;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.WebSocket;

public class MainActivity extends BaseActivity implements MainMvpView, WebSocketClient.WebSocketListener {

    @Inject
    MainActivityPresenter mPresenter;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Inject
    WebSocketClient webSocketClient;
    private WebSocket webSocket;
    private boolean isWebSocketConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter.attachView(this);
        setSupportActionBar(toolbar);
        webSocketClient.run(new OkHttpClient(), Constant.BASE_URL,this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        this.webSocket = webSocket;
        isWebSocketConnected = true;
    }

    @Override
    public void onMessage(WebSocket webSocket, String text) {
        mPresenter.handleMessage(text);

    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
      isWebSocketConnected = false;
    }

    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
      //close all thing related to sockets

    }

    @Override
    public void updateUI() {
        /**
         * Update UI from Here
         * like recycle view for messages
         */
    }

    @OnClick(R.id.btnSend)
    public void onSendBtnClicked(){
        if(webSocket != null || isWebSocketConnected ){
            webSocket.send("text from edittext with other parameters converted into josn and send from here.");
        }else{
            //send error to user that socket connection failed.
        }
    }
}
