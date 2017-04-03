package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "OnCreate()");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("MainActivity", "OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.w("MainActivity", "OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("MainActivity", "OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("MainActivity", "OnDestroy()");
    }
}
