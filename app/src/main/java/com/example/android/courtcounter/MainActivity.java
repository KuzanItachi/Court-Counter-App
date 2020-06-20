package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_TeamA=0;
    int score_TeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void AddThreeforTeamA(View view)
    {  score_TeamA=score_TeamA+3;
        displayForTeamA(score_TeamA);
    }
    public void AddTwoforTeamA(View view)
    {   score_TeamA=score_TeamA+2;
        displayForTeamA(score_TeamA);
    }
    public void AddOneforTeamA(View view)
    {   score_TeamA=score_TeamA+1;
        displayForTeamA(score_TeamA);
    }
    public void AddThreeforTeamB(View view)
    {  score_TeamB=score_TeamB+3;
        displayForTeamB(score_TeamB);
    }
    public void AddTwoforTeamB(View view)
    {   score_TeamB=score_TeamB+2;
        displayForTeamB(score_TeamB);
    }
    public void AddOneforTeamB(View view)
    {   score_TeamB=score_TeamB+1;
        displayForTeamB(score_TeamB);
    }
    public void Reset(View view)
    {
        score_TeamA=0;
        score_TeamB=0;
        displayForTeamB(score_TeamB);
        displayForTeamA(score_TeamA);
    }
}
