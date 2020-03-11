package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Question question = new Question("combien fait 2x2 ?",
                "4",
                0,
                0,
                0);

        ArrayList<String> radom = new  ArrayList();
        radom.add("toto");
        radom.add("tata");

        //affiche la question
        TextView viewById = findViewById(R.id.boxQuestion);
        viewById.setText(question.getQuestion());

        //affiche les choix en radio( en dur)
        RadioButton choice1 = findViewById(R.id.Choice1);
        choice1.setText(question.getGoodResult());
        RadioButton choice2 = findViewById(R.id.Choice2);
        choice2.setText(radom.get(0));
        RadioButton choice3 = findViewById(R.id.Choice3);
        choice3.setText(radom.get(1));


        Button submitButton = findViewById(R.id.Submit);









        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup viewById2 = findViewById(R.id.RadioGroup);

                int checkedRadioButtonId = viewById2.getCheckedRadioButtonId();

                RadioButton b =findViewById(checkedRadioButtonId);

                if(b.getText().equals(question.getGoodResult())){
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Bonne réponse !");
                }else{
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Raté. La bonne réponse est : " + question.getGoodResult());
                }
                Log.i("MainActivity","test message "+b.getText());
            }
        });

    }
}
