package com.learn.chinesequiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class HomePage extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button buttonStart = findViewById(R.id.startBtn);
        buttonStart.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {




            switch (v.getId()){
                case R.id.startBtn:

                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Choisir une difficulté :");
                    String[] difficult = {"FACILE","NORMAL","DIFFICILE"};
                    builder.setItems(difficult, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(HomePage.this, MainActivity.class);

                            switch (which) {

                                case 0: // FACILE
                                    ArrayList<Question> easyQuestions = QuestionHelper.getEasyQuestions();
                                    ArrayList<String> wrongEasyResponses = QuestionHelper.getWrongEasyResponses();
                                    Collections.shuffle(easyQuestions);
                                    intent.putStringArrayListExtra("Wrong",wrongEasyResponses);
                                    intent.putParcelableArrayListExtra("difficulty",easyQuestions);
                                    intent.putExtra("difficultyString","easy");
                                    intent.putExtra("index",0);

                                    startActivity(intent);
                                    break;
                                case 1:
                                    ArrayList<Question> mediumQuestions = QuestionHelper.getMediumQuestions();
                                    ArrayList<String> wrongMediumResponses1 = QuestionHelper.getWrongMediumResponses();
                                    startActivity(intent);
                                    break;
                                case 2:
                                    ArrayList<Question> hardQuestions = QuestionHelper.getHardQuestions();
                                    ArrayList<String> wrongHardResponses = QuestionHelper.getWrongHardResponses();
                                    startActivity(intent);
                                    break;
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                    break;
            }
    }
}
