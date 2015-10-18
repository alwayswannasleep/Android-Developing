package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.kraevskiy.vclone.app2.Adapters.FriendsAdapter;
import com.kraevskiy.vclone.app2.POJO.Friend;
import com.kraevskiy.vclone.app2.R;
import com.kraevskiy.vclone.app2.Utils;

import java.util.List;

public class FriendsActivity extends Activity{

    public static final String EXTRA_DATA = "Data";

    private static final String TAG = FriendsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        ListView friendsList = (ListView) findViewById(R.id.friends_list);

        friendsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Friend friend = (Friend) adapterView.getItemAtPosition(position);

                Intent intent = new Intent(getApplicationContext(), FriendActivity.class);
                intent.putExtra(EXTRA_DATA, friend);

                Log.d(TAG, "Friend id = " + friend.getId());

                startActivity(intent);
            }
        });

        final FriendsAdapter friendsAdapter = new FriendsAdapter(this, Utils.getFriendsListArray());

        friendsList.setAdapter(friendsAdapter);

        Log.d(TAG, "FriendsActivity created");
    }
}
