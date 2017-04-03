package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);

        Log.v("DisplayMessageActivity", "OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("DisplayMessageActivity", "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("DisplayMessageActivity", "OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.w("DisplayMessageActivity", "OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("DisplayMessageActivity", "OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("DisplayMessageActivity", "OnDestroy()");
    }
}
