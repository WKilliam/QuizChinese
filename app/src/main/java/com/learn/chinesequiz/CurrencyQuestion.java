package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

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

        srcintent.getStringArrayListExtra("Wrong");
        //ArrayList<Question> questionList = srcintent.getParcelableArrayListExtra("difficulty");
        srcintent.getStringExtra("difficultyString");

        currencie = QuestionHelper.getEasyQuestions();



        adapter = new CurrencyAdapte(currencie);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
