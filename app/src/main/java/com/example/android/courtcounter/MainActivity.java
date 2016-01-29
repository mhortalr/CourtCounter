package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3A(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void add2A(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void add1A(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void add3B(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    public void add2B(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void add1B(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
