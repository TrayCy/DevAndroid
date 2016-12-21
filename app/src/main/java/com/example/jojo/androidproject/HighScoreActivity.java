package com.example.jojo.androidproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jojo on 27/11/2016.
 */
public class HighScoreActivity extends Activity {
    private TextView textTile;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText("Top des parties");

    }
}
