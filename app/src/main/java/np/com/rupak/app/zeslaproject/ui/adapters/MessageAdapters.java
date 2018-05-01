package np.com.rupak.app.zeslaproject.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import np.com.rupak.app.zeslaproject.ui.viewholder.MessageViewHolder;

/**
 * Created by rupak on 5/1/18.
 */

public class MessageAdapters extends RecyclerView.Adapter<MessageViewHolder> {
    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private int getItemType(){
        return 0;
    }
}
