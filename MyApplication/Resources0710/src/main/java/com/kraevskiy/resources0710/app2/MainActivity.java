package com.kraevskiy.resources0710.app2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    private final String TAG = MainActivity.class.getName();
    private final String OPEN_STR = "Open";
    private final String VIEW_STR = "View";
    private final String HELP_STR = "Help";
    private final String CLOSE_STR = "Close";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_open:
                Toast.makeText(getApplicationContext(), OPEN_STR, Toast.LENGTH_LONG).show();
                Log.d(TAG, OPEN_STR);
                break;
            case R.id.action_view:
                Toast.makeText(getApplicationContext(), VIEW_STR, Toast.LENGTH_LONG).show();
                Log.d(TAG, VIEW_STR);
                break;
            case R.id.action_help:
                Toast.makeText(getApplicationContext(), HELP_STR, Toast.LENGTH_LONG).show();
                Log.d(TAG, HELP_STR);
                break;
            case R.id.action_close:
                Toast.makeText(getApplicationContext(), CLOSE_STR, Toast.LENGTH_LONG).show();
                Log.d(TAG, CLOSE_STR);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
