package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("test_log","on create log");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test_log","on start log");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test_log","on Resume log");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test_log","on Pause log");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test_log","on Stop log");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test_log","on Destroy log");
    }
}