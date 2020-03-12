package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int value;
    private int count=0;
    private ArrayList<Question> mediumQuestions;
    private ArrayList<String> wrongMediumResponses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent srcintent = getIntent();
        srcintent.getStringExtra("easyList");
        srcintent.getStringExtra("easyWrong");


        Button submitButton = findViewById(R.id.Submit);
        submitButton.setOnClickListener(this);
    }

    public void playQuiz(ArrayList<Question> questions,ArrayList<String> wrongResponses){


        int sizeListQuestion = questions.size();


        //Question question = QuestionHelper.getMediumQuestions().get(value);

        TextView questionBox = findViewById(R.id.boxQuestion);
        questionBox.setText(questions.get(this.value).getQuestion());


        String goodResult = questions.get(this.value).getGoodResult();

        ArrayList<String> listProposition = creatListRandom(goodResult,wrongResponses);
        Log.i("MainActivity","liste de propositions" +listProposition);

        RadioButton choice1 = findViewById(R.id.Choice1);
        RadioButton choice2 = findViewById(R.id.Choice2);
        RadioButton choice3 = findViewById(R.id.Choice3);




        choice1.setText(listProposition.get(0));

        choice2.setText(listProposition.get(1));

        choice3.setText(listProposition.get(2));






    }


    /**
     *
     * @param goodResult
     * @param listTake
     * @return
     */
    public ArrayList<String> creatListRandom(String goodResult,ArrayList<String> listTake){

        Random rand = new Random();

        ArrayList<String> listRandom =new ArrayList<>();

        while(listRandom.size()!=2){

            int i3 = rand.nextInt(listTake.size());

            String s = listTake.get(i3);

            if(!listRandom.contains(s)){
                listRandom.add(s);
            }

        }
        listRandom.add(goodResult);

        // rendre la liste des reponses aléatoires
        Collections.shuffle(listRandom);

        return listRandom;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Submit:

                RadioGroup viewById2 = findViewById(R.id.RadioGroup);

                int checkedRadioButtonId = viewById2.getCheckedRadioButtonId();

                RadioButton b =findViewById(checkedRadioButtonId);



                TextView questionBox = findViewById(R.id.boxQuestion);
                questionBox.setText(this.mediumQuestions.get(this.value).getQuestion());

                //this.mediumQuestions = QuestionHelper.getMediumQuestions();



                String goodResult = this.mediumQuestions.get(this.value).getGoodResult();


                if(b.getText().equals(goodResult)){
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Bonne réponse !");
                    this.value=this.value+1;
                    playQuiz(mediumQuestions,wrongMediumResponses);
                }else{
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Raté. La bonne réponse est : " + goodResult);
                    this.value=this.value+1;
                    playQuiz(mediumQuestions,wrongMediumResponses);
                }
                TextView viewById = findViewById(R.id.boxTest);
                viewById.setText("test : "+this.value);
        }
    }

    public int getValue() {
        return value;
    }
}
