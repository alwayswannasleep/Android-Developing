package com.kraevskiy.vclone.app2.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kraevskiy.vclone.app2.POJO.Group;
import com.kraevskiy.vclone.app2.R;

import java.util.List;

public class GroupsAdapter extends ArrayAdapter<Group> {

    public GroupsAdapter(Context context, List<Group> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = View.inflate(getContext(),
                    R.layout.groups_list_item, null);
        }

        ImageView gAvatarView = (ImageView) itemView
                .findViewById(R.id.group_list_item_avatar);
        TextView gScreenNameView = (TextView) itemView
                .findViewById(R.id.group_list_item_screen_name);
        TextView gTypeView = (TextView) itemView
                .findViewById(R.id.group_list_item_type);

        Group group = getItem(position);

        gAvatarView.setImageResource(group.getPhoto());
        gScreenNameView.setText(group.getScreenName());
        gTypeView.setText(group.getType());

        return itemView;
    }
}
