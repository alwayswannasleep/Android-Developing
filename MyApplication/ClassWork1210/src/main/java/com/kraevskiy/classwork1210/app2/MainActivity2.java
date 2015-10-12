package com.kraevskiy.classwork1210.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends Activity {

    public static final String EXTRA_TEXT = "Text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editText =(EditText) findViewById(R.id.edit_text);

                        Intent intent = new Intent(
                                MainActivity2.this, MainActivity.class
                        );
                        intent.putExtra(EXTRA_TEXT, editText.getText().toString());
                        startActivity(intent);
                    }
                });
    }
}
