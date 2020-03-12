package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button buttonStart = findViewById(R.id.startBtn);
        Button viewEasyBtn = findViewById(R.id.easybtn);
        Button viewMediumBtn = findViewById(R.id.mediumBtn);
        Button viewHardBtn = findViewById(R.id.hardBtn);



        viewEasyBtn.setVisibility(View.INVISIBLE);
        viewMediumBtn.setVisibility(View.INVISIBLE);
        viewHardBtn.setVisibility(View.INVISIBLE);

        buttonStart.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        Intent intent = new Intent(HomePage.this, MainActivity.class);
            switch (v.getId()){
                case R.id.startBtn:

                    Button buttonStart = findViewById(R.id.startBtn);
                    Button viewEasyBtn = findViewById(R.id.easybtn);
                    Button viewMediumBtn = findViewById(R.id.mediumBtn);
                    Button viewHardBtn = findViewById(R.id.hardBtn);

                    buttonStart.setVisibility(View.INVISIBLE);
                    viewEasyBtn.setVisibility(View.VISIBLE);
                    viewMediumBtn.setVisibility(View.VISIBLE);
                    viewHardBtn.setVisibility(View.VISIBLE);

                    viewEasyBtn.setOnClickListener(this);

                    break;
                case R.id.easybtn:
                    ArrayList<Question> easyQuestions = QuestionHelper.getEasyQuestions();
                    ArrayList<String> wrongEasyResponses = QuestionHelper.getWrongEasyResponses();
                    intent.putExtra("easylist",easyQuestions);
                    intent.putExtra("easyWrong",wrongEasyResponses);
                    startActivity(intent);
                    break;
                case R.id.mediumBtn:
                    ArrayList<Question> mediumQuestions = QuestionHelper.getMediumQuestions();
                    ArrayList<String> wrongMediumResponses1 = QuestionHelper.getWrongMediumResponses();
                    startActivity(intent);
                    break;
                case R.id.hardBtn:
                    ArrayList<Question> hardQuestions = QuestionHelper.getHardQuestions();
                    ArrayList<String> wrongHardResponses = QuestionHelper.getWrongHardResponses();
                    startActivity(intent);
                    break;

            }
    }
}
