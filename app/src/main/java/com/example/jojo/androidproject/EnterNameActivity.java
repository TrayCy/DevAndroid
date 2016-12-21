package com.example.jojo.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by Jojo on 27/11/2016.
 */
public class EnterNameActivity extends Activity  {
    private TextView textTitle;
    private EditText editName, editName2;
    private Button goButton,reglesButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entername);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText("Entrez le nom des joueurs");

        EditText editName = (EditText)findViewById (R.id.editText);
        EditText editName2 = (EditText)findViewById (R.id.editText2);

        Button goButton = (Button) findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener(){
            public void onClick( View v) {
                Intent intent = new Intent(EnterNameActivity.this, DiceActivity.class);
                startActivity(intent);
            }
        });

        Button reglesButton = (Button) findViewById(R.id.reglesButton);
        reglesButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent2 = new Intent(EnterNameActivity.this, ReglesActivity.class);
                startActivity(intent2);
            }
        });
    }
}
