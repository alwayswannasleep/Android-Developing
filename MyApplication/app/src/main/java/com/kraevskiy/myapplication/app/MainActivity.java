package com.kraevskiy.myapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends Activity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File storage = Environment.getRootDirectory();

        PrintFilePaths(storage);

        Button myButton = (Button) findViewById(R.id.button_1);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click");
            }
        });
    }

    private void PrintFilePaths(File file) {
        Log.d(TAG, file.getPath());

        File[] files = file.listFiles();
        if (files == null) {
            return;
        }

        for (File f : files) {
            if (f.isDirectory()){
                Log.d(TAG, f.getPath());

                PrintFilePaths(f);
            } else {
                Log.d(TAG, f.getPath());
            }
        }
    }
}
