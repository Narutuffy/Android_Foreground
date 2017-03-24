package com.example.vamsirao.foreground;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent alarmIntent = new Intent(this, Foreground.class);

        PendingIntent pendingIntent = PendingIntent.getService(this, 1, alarmIntent, 0);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 60000,60000, pendingIntent);



    }
}
