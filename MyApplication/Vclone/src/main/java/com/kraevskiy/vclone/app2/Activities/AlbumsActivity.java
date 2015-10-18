package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.kraevskiy.vclone.app2.R;

public class AlbumsActivity extends Activity {

    private static final String TAG = AlbumsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Log.d(TAG, "AlbumsActivity created");
    }
}
