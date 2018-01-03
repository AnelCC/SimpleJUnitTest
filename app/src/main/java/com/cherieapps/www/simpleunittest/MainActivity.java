package com.cherieapps.www.simpleunittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        TextView textView = findViewById(R.id.tv_value);
        EditText editText= findViewById(R.id.edt_value);
        textView.setText(editText.getText().toString());
    }
}
