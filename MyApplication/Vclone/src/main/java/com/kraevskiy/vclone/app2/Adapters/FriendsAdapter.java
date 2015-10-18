package com.kraevskiy.vclone.app2.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kraevskiy.vclone.app2.POJO.Friend;
import com.kraevskiy.vclone.app2.R;

import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    public FriendsAdapter(Context context, List<Friend> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = View.inflate(getContext(),
                    R.layout.friend_list_item, null);
        }

        ImageView fIsOnlineView = (ImageView) itemView
                .findViewById(R.id.friend_list_item_is_online);
        ImageView fAvatarView = (ImageView) itemView
                .findViewById(R.id.friend_list_item_avatar);
        TextView fNameView = (TextView) itemView
                .findViewById(R.id.friend_list_item_name);

        Friend friend = getItem(position);

        fAvatarView.setImageResource(friend.getPhoto());
        fNameView.setText(friend.getFirstName() + " " + friend.getLastName());

        if (friend.isOnline()) {
            fIsOnlineView.setVisibility(View.VISIBLE);
        } else {
            fIsOnlineView.setVisibility(View.INVISIBLE);
        }

        return itemView;
    }
}
