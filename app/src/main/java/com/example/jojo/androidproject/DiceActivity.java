package com.example.jojo.androidproject;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by Jojo on 26/11/2016.
 */
public class DiceActivity extends Activity implements View.OnClickListener {
    private TextView textResult;
    private int max = 3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText("Spag'sDice");

        textResult = ((TextView)findViewById(R.id.textResult));
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.rollButton);
        buttonRoll.setOnClickListener(this);

    }

    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }
}