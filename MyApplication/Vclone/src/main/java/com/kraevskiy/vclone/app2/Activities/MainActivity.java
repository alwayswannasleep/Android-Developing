package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.kraevskiy.vclone.app2.R;
import com.kraevskiy.vclone.app2.Storage;
import com.kraevskiy.vclone.app2.Utils;


public class MainActivity extends Activity {

    private static String TAG = MainActivity.class.getSimpleName();

    public Button BtnFriends;
    public Button BtnGroups;
    public Button BtnNews;
    public Button BtnDialogs;
    public Button BtnAlbums;
    public Button BtnVideos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.init();
        initButtons();

        OnClickListener onClickListener = new OnClickListener() {

            @Override
            public void onClick(View view) {
                int viewId = view.getId();

                Intent intent = null;

                switch (viewId) {
                    case R.id.btnFriends:
                        Log.d(TAG, "Starting friends activity");

                        intent = new Intent(getApplicationContext(), FriendsActivity.class);
                        break;

                    case R.id.btnGroups:
                        Log.d(TAG, "Starting groups activity");

                        intent = new Intent(getApplicationContext(), GroupsActivity.class);
                        break;

                    case R.id.btnNews:
                        Log.d(TAG, "Starting news activity");

                        intent = new Intent(getApplicationContext(), NewsActivity.class);
                        break;

                    case R.id.btnDialogs:
                        Log.d(TAG, "Starting dialogs activity");

                        intent = new Intent(getApplicationContext(), DialogsActivity.class);
                        break;

                    case R.id.btnAlbums:
                        Log.d(TAG, "Starting albums activity");

                        intent = new Intent(getApplicationContext(), AlbumsActivity.class);
                        break;

                    case R.id.btnVideos:
                        Log.d(TAG, "Starting videos activity");

                        intent = new Intent(getApplicationContext(), VideosActivity.class);
                        break;
                }

                startActivity(intent);
            }
        };

        BtnFriends.setOnClickListener(onClickListener);
        BtnGroups.setOnClickListener(onClickListener);
        BtnNews.setOnClickListener(onClickListener);
        BtnDialogs.setOnClickListener(onClickListener);
        BtnAlbums.setOnClickListener(onClickListener);
        BtnVideos.setOnClickListener(onClickListener);
    }

    private void initButtons() {
        BtnFriends = (Button) findViewById(R.id.btnFriends);
        BtnGroups = (Button) findViewById(R.id.btnGroups);
        BtnNews = (Button) findViewById(R.id.btnNews);
        BtnDialogs = (Button) findViewById(R.id.btnDialogs);
        BtnAlbums = (Button) findViewById(R.id.btnAlbums);
        BtnVideos = (Button) findViewById(R.id.btnVideos);
    }
}
