package ch.techteam.techteamlauzhack;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private StateMode stateMode_;
    private RunningMode runningMode_;
    private float meanHeartRate_;
    private float slowIntervalTime;
    private float fastIntervalTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_main);

    }
}
