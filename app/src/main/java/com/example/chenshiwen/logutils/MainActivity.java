package com.example.chenshiwen.logutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String LogPrefix = "LogPrefix1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtils.d(LogPrefix, "%s", "onCreate");
        LogUtils.d(this, "%s", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        LogUtils.i(LogPrefix, "%s", "onStart");
        LogUtils.i(this, "%s", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        LogUtils.v(LogPrefix, "%s", "onResume");
        LogUtils.v(this, "%s", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        LogUtils.w(LogPrefix, "%s", "onPause");
        LogUtils.w(this, "%s", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        LogUtils.e(LogPrefix, new Throwable(),"%s", "onStop");
        LogUtils.e(this, new Throwable(), "%s", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
