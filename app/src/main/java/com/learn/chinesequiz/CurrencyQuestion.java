package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class CurrencyQuestion extends AppCompatActivity {


    private ArrayList<Question> currencie;
    private CurrencyAdapte adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_question);

        Intent srcintent = getIntent();

        String difficultycheck = srcintent.getStringExtra("difficultycheck");

        if(difficultycheck.equals("EASY")){
            currencie = QuestionHelper.getEasyQuestions();
        }else if(difficultycheck.equals("MEDIUM")){
            currencie = QuestionHelper.getMediumQuestions();
        }else if(difficultycheck.equals("HARD")){
            currencie = QuestionHelper.getHardQuestions();
        }

        adapter = new CurrencyAdapte(currencie);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
