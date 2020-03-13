package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        Intent scoreIntent = getIntent();
        String difficulty = scoreIntent.getStringExtra("difficulty");

        int goodAnswers = scoreIntent.getIntExtra("CounterGood", 0);
        int size =  scoreIntent.getIntExtra("Size", 0);
        Log.i("ScorePage","la difficulté est : " +difficulty);

        int scorePurcent = (int) (((float)goodAnswers/size) * 100.f);


        TextView dpDifficulty = findViewById(R.id.difficulty_quiz);
        TextView dpScoreGoodTotal = findViewById(R.id.score_good_total);
        TextView dpScorePurcent = findViewById(R.id.score_purcent);
        dpDifficulty.setText(difficulty);
        dpScoreGoodTotal.setText(goodAnswers+"/"+size);
        dpScorePurcent.setText(scorePurcent+"%");

        findViewById(R.id.home_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent home = new Intent(ScorePage.this, HomePage.class);
                startActivity(home);
                finish();
            }
        });







    }
}
