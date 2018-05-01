package np.com.rupak.app.zeslaproject.networking;

/**
 * Created by Rupak on 05/01/18.
 */

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public class WebSocketClient extends WebSocketListener {
    WebSocketListener listener;
     WebSocket socket;
    @Inject
    public WebSocketClient(){

    }

    public void run(OkHttpClient client, String url, WebSocketListener listener) {
        this.listener=listener;


        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newWebSocket(request, this);

        // Trigger shutdown of the dispatcher's executor so this process can exit cleanly.
        //client.dispatcher().executorService().shutdown();
    }

    @Override public void onOpen(WebSocket webSocket, Response response) {
        listener.onOpen(webSocket, response);

        //webSocket.close(1000, "Goodbye, World!");
    }

    @Override public void onMessage(WebSocket webSocket, String text) {
        System.out.println("MESSAGE: " + text);
        listener.onMessage(webSocket,text);
    }

    @Override public void onMessage(WebSocket webSocket, ByteString bytes) {
        System.out.println("MESSAGE: " + bytes.hex());
    }

    @Override public void onClosing(WebSocket webSocket, int code, String reason) {
        webSocket.close(1000, null);
        System.out.println("CLOSE: " + code + " " + reason);
        listener.onClosing(webSocket,code,reason);
    }

    @Override public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        t.printStackTrace();
        listener.onFailure(webSocket,t,response);
    }





    public interface WebSocketListener{
        public void onOpen(WebSocket webSocket, Response response);
        public void onMessage(WebSocket webSocket, String text);
        public void onFailure(WebSocket webSocket, Throwable t, Response response);
        public void onClosing(WebSocket webSocket, int code, String reason);

    }

}
