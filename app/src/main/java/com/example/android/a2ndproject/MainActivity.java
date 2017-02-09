package com.example.android.a2ndproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    //This method is called when Goal button for Team1 is beeing pressed and increments the score total by 1
    public void increment1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        displayTeam1(scoreTeam1);
    }

    //This method is displaying the number of scored points of Team1 when called
    public void displayTeam1(int score) {
        TextView scoreTextViewTeam1 = (TextView) findViewById(R.id.team1Counter);
        scoreTextViewTeam1.setText("" + scoreTeam1);
    }

    //This method is called when Goal button for Team2 is beeing pressed and increments the score total by
    public void increment2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        displayTeam2(scoreTeam2);
    }

    //This method is displaying the number of scored points of Team2 when called
    public void displayTeam2(int score) {
        TextView scoreTextViewTeam2 = (TextView) findViewById(R.id.team2Counter);
        scoreTextViewTeam2.setText("" + scoreTeam2);
    }

    //This method is called when reset button is being pressed, and resets both score counter to 0
    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayTeam1(scoreTeam1);
        displayTeam2(scoreTeam2);
    }
}