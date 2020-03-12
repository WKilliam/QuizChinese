package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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

    private int index;
    private ArrayList<Question> mediumQuestions;
    private ArrayList<String> wrongMediumResponses;
    private ArrayList<String> easyWrong;
    private ArrayList<Question> easylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent srcintent = getIntent();

        this.index = srcintent.getIntExtra("index",0);
        easyWrong = srcintent.getStringArrayListExtra("Wrong");
        easylist = srcintent.getParcelableArrayListExtra("difficulty");

        playOneInit(easylist, easyWrong);

        Button submitButton = findViewById(R.id.Submit);
        submitButton.setOnClickListener(this);
    }

    public void playOneInit(ArrayList<Question> questions,ArrayList<String> wrongResponses){


        TextView questionBox = findViewById(R.id.boxQuestion);
        questionBox.setText(questions.get(this.index).getQuestion());

        String goodResult = questions.get(this.index).getGoodResult();

        ArrayList<String> listProposition = creatListRandom(goodResult,wrongResponses);

        RadioButton choice1 = findViewById(R.id.Choice1);
        RadioButton choice2 = findViewById(R.id.Choice2);
        RadioButton choice3 = findViewById(R.id.Choice3);

        choice1.setText(listProposition.get(0));

        choice2.setText(listProposition.get(1));

        choice3.setText(listProposition.get(2));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Submit:

                Log.i("MainActivity","coucou : : : : : : : :");


                Intent srcintent = getIntent();
                ArrayList<String> easyWrong = srcintent.getStringArrayListExtra("Wrong");
                ArrayList<Question> easylist = srcintent.getParcelableArrayListExtra("difficulty");

                Log.i("MainActivity","++++++++++++++++++++++++++++++++++++");

                String goodResult = easylist.get(index).getGoodResult();

                RadioGroup viewById2 = findViewById(R.id.RadioGroup);

                int checkedRadioButtonId = viewById2.getCheckedRadioButtonId();

                RadioButton b =findViewById(checkedRadioButtonId);

                Log.i("MainActivity","coucou "+b+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

                TextView submitButton = findViewById(R.id.Submit);

                if(b.getText().equals(goodResult)){
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Bonne réponse !");

                    Intent intent = new Intent(this, MainActivity.class);



                    //playQuiz(easylist, easyWrong, index);
                    this.index = this.index+1 ;

                    intent.putStringArrayListExtra("Wrong",easyWrong);
                    intent.putParcelableArrayListExtra("difficulty",easylist);
                    //intent.putExtra("value",value);
                    intent.putExtra("index",this.index);

                    startActivity(intent);

                    submitButton.setText("Suivante");
                    Log.i("MainActivity","coucou §§§§§§§§§§§§§§§§§§§§§§§§§§§§§§ "+this.index);

                }else{

                    Intent intent = new Intent(this, MainActivity.class);
                    
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Raté. La bonne réponse est : " + goodResult);
                    //playQuiz(easylist, easyWrong, index);
                    this.index = this.index +1;
                    intent.putStringArrayListExtra("Wrong",easyWrong);
                    intent.putParcelableArrayListExtra("difficulty",easylist);
                    //intent.putExtra("value",value);
                    intent.putExtra("index",this.index);

                    startActivity(intent);

                    submitButton.setText("Suivante");
                    Log.i("MainActivity","coucou ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ "+this.index);
                }

                TextView viewById = findViewById(R.id.boxTest);
                viewById.setText("test : "+this.index);
        }
    }


    public void playQuiz(ArrayList<Question> questions,ArrayList<String> wrongResponses,int index){


        TextView questionBox = findViewById(R.id.boxQuestion);
        questionBox.setText(questions.get(index).getQuestion());

        String goodResult = questions.get(index).getGoodResult();

        ArrayList<String> listProposition = creatListRandom(goodResult,wrongResponses);

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

}
