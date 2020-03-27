package com.darayuth.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /****
     * switchActivity is method to switch from first to second activity.
     * @param view
     */
    public void switchActivity(View view){
        Intent intent = new Intent(this, activity_2.class);
        startActivity(intent);
    }
}
