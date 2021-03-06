package com.kraevskiy.homework1.app2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String EXTRA_COUNTER = "counter";
    private static final String TAG = MainActivity.class.getSimpleName();

    private int counter = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_notifications);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(EXTRA_COUNTER);
        }

        Log.d(TAG, "OnCreate()" + counter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(EXTRA_COUNTER, ++counter);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "OnPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "OnStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "OnDestroy()");
    }
}
