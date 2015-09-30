package com.kraevskiy.myapplication.app;

import android.app.Activity;
import android.graphics.Path;
import android.os.Environment;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;


public class MainActivity extends Activity {

    public final String STORAGE_TAG = "Storage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File storage = Environment.getDataDirectory();
        Log.d(STORAGE_TAG, storage.getPath());


    }
}
