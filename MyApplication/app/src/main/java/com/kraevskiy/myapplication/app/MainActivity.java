package com.kraevskiy.myapplication.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_notifications);

        View.OnTouchListener onTouchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(Color.rgb(197, 240, 246));
                        Log.i(TAG, "ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_CANCEL:
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(Color.WHITE);
                        Log.i(TAG, "ACTION_UP");
                        break;
                }

                return true;
            }
        };

        findViewById(R.id.notification_1).setOnTouchListener(onTouchListener);
        findViewById(R.id.notification_2).setOnTouchListener(onTouchListener);
        findViewById(R.id.notification_3).setOnTouchListener(onTouchListener);
        findViewById(R.id.notification_4).setOnTouchListener(onTouchListener);
    }
}
