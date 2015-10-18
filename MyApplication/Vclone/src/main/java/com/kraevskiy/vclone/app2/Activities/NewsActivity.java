package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.kraevskiy.vclone.app2.R;

public class NewsActivity extends Activity {

    private static final String TAG = NewsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Log.d(TAG, "NewsActivity created");
    }
}
