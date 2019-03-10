package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int wicketA = 0;
    int scoreB = 0;
    int wicketB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add1ToA(View view) {
        if (wicketA <= 5) {
            scoreA += 1;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add2ToA(View view) {
        if (wicketA <= 5) {

            scoreA += 2;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add3ToA(View view) {
        if (wicketA <= 5) {

            scoreA += 3;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add4ToA(View view) {
        if (wicketA <= 5) {

            scoreA += 4;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add5ToA(View view) {
        if (wicketA <= 5) {

            scoreA += 5;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add6ToA(View view) {
        if (wicketA <= 5) {

            scoreA += 6;
            displayForTeamA(scoreA, wicketA);
        }
    }

    public void add1WicketA(View view) {
        wicketA += 1;

        if (wicketA <= 5)
            displayForTeamA(scoreA, wicketA);
        else
            displayForTeamASummary(scoreA, wicketA);

    }

    public void displayForTeamA(int scoreA, int wicketA) {
        TextView scoreView = findViewById(R.id.scoreForA);
        scoreView.setText(String.valueOf(scoreA + "/" + wicketA));
    }

    public void displayForTeamASummary(int scoreA, int wicketA) {
        int target = scoreA + 1;
        TextView scoreView = findViewById(R.id.scoreForA);
        scoreView.setText(String.valueOf("Innings Ended" + "\n" + "Your score is : " + scoreA + "/" + wicketA + "\n" + "Target for Team B : " + target));
    }

    public void add1ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {
            scoreB += 1;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add2ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {

            scoreB += 2;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add3ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {

            scoreB += 3;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add4ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {

            scoreB += 4;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add5ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {

            scoreB += 5;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add6ToB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {

            scoreB += 6;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void add1WicketB(View view) {
        if (wicketB <= 5 && (scoreB < scoreA + 1)) {
            wicketB += 1;
            displayForTeamB(scoreB, wicketB);
        } else

            displayForTeamBSummary(scoreB, wicketB);
    }

    public void displayForTeamB(int scoreB, int wicketB) {
        TextView scoreView = findViewById(R.id.scoreForB);
        scoreView.setText(String.valueOf(scoreB + "/" + wicketB));
    }

    public void displayForTeamBSummary(int scoreB, int wicketB) {
        TextView scoreView = findViewById(R.id.scoreForB);
        scoreView.setText(String.valueOf("Innings Ended" + "\n" + "Your score is : " + scoreB + "/" + wicketB));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        wicketA = 0;
        wicketB = 0;
        displayForTeamA(scoreA, wicketA);
        displayForTeamB(scoreB, wicketB);
    }

    public void result(View view) {
        char ch;
        if (scoreA > scoreB) {
            ch = 'A';
            displayResult(ch);
        } else if (scoreB > scoreA) {
            ch = 'B';
            displayResult(ch);
        } else {
            ch = 'T';
            displayResult(ch);
        }
    }

    public void displayResult(char ch) {
        TextView scoreView1 = findViewById(R.id.scoreForA);
        TextView scoreView2 = findViewById(R.id.scoreForB);
        if (ch == 'A' || ch == 'B') {
            scoreView1.setText(String.valueOf("Team " + ch + " won the game!"));
            scoreView2.setText(String.valueOf("Team " + ch + " won the game!"));
        } else {
            scoreView1.setText(String.valueOf("The game was a Tie! Well Played!"));
            scoreView2.setText(String.valueOf("The game was a Tie! Well Played!"));
        }

    }


}
