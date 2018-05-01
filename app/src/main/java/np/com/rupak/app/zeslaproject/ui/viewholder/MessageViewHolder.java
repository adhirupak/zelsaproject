package np.com.rupak.app.zeslaproject.ui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import np.com.rupak.app.zeslaproject.R;

/**
 * Created by rupak on 5/1/18.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {

    private TextView msgFrom, textMsg;

    public MessageViewHolder(View itemView) {
        super(itemView);
        msgFrom = (TextView) itemView.findViewById(R.id.msgFrom);
        textMsg = (TextView) itemView.findViewById(R.id.txtMsg);
    }


}
