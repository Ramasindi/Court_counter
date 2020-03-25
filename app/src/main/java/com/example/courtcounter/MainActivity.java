package com.example.courtcounter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
int scoreTeamA = 0;
    public void displayForTeamA(int score) {
                TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
   //This method is for adding three points
    public void addThreePoints(View v){
        scoreTeamA += 3;
     displayForTeamA(scoreTeamA);
    }
    //This method is for adding two points
    public void addTwoPoints(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    //This method is for adding one point
    public void addOnePoint(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /**
    *Displays the given score for Team B
     */
    int scoreTeamB = 0;
    public void displayForTeamB(int score) {
        TextView scoreView =  findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //This method is for adding three points
    public void addThreePointsB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    //This method is for adding two points
    public void addTwoPointsB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    //This method is for adding one point
    public void addOnePointB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    // Method for resetting the score
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
