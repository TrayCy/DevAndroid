package com.example.jojo.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jojo on 27/11/2016.
 */
public class ReglesActivity extends Activity implements View.OnClickListener {
    private Button startButton;
    private TextView textTitle, textTitle2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regles);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText("Regles du jeu");

        TextView textTitle2 = (TextView) findViewById(R.id.textTitle2);
        textTitle2.setText(" But : avoir 13 pts en premier\n" +
                " Pendant son tour le joueur doit piocher 3 dés parmi les 13 disponibles et les lance.\n" +
                " Résultats possibles : \n" +
                "        - Pates : +1 pt de coté et enlève le dé\n" +
                "        - Fourchette : +1 blessure et enlève le dé\n" +
                "        - Casserole : garde le dé si il relance\n" +
                " Issues : \n" +
                "    - si le joueur a trois blessures i larrete son tour et ne gagne pas ses pts mis de coté\n" +
                "    - le joueur arrete son tour ou n'a plus de dé et gagne ses pts\n" +
                "    - le joueur décide de lancer à nouveau");

        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
    }
        public void onClick(View v) {
            Intent intent = new Intent(ReglesActivity.this, DiceActivity.class);
            startActivity(intent);
        }

}
