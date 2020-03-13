package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int index;
    private int counter;
    private String difficulty;
    private ArrayList<String> wrongAnswerList;
    private ArrayList<Question> questionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent srcintent = getIntent();

        this.index = srcintent.getIntExtra("index",0);
        this.wrongAnswerList = srcintent.getStringArrayListExtra("Wrong");
        this.questionList = srcintent.getParcelableArrayListExtra("difficulty");
        this.difficulty = srcintent.getStringExtra("difficultyString");
        this.counter = srcintent.getIntExtra("counter",0);

        // ici si on selection rien ça ne pête pas
        // quand on n'a pas selectioner le bouton sumit n'affiche pas
        // une fois on a selectioner le bouton sera visible
        //Button submitButton = findViewById(R.id.Submit);
        //RadioGroup viewById2 = findViewById(R.id.RadioGroup);

        //if(!(viewById2.getCheckedRadioButtonId()== -1)) {

        Button submitButton = findViewById(R.id.Submit);
        playInit(this.questionList, this.wrongAnswerList);
        submitButton.setOnClickListener(this);


        //start();

    }

    public void start (){
        Button submitButton = findViewById(R.id.Submit);
        playInit(this.questionList, this.wrongAnswerList);
        submitButton.setOnClickListener(this);
    }

    public void playInit(ArrayList<Question> questions, ArrayList<String> wrongResponses){


        TextView questionBox = findViewById(R.id.boxQuestion);
        questionBox.setText(questions.get(this.index).getQuestion());

        String goodResult = questions.get(this.index).getGoodResult();

        ArrayList<String> listProposition = creatListRandom(goodResult,wrongResponses);

        RadioButton choice1 = findViewById(R.id.Choice1);
        RadioButton choice2 = findViewById(R.id.Choice2);
        RadioButton choice3 = findViewById(R.id.Choice3);

        ImageView viewById1 = findViewById(R.id.imageView);

        viewById1.setImageResource(questions.get(this.index).getPicture());

        choice1.setText(listProposition.get(0));

        choice2.setText(listProposition.get(1));

        choice3.setText(listProposition.get(2));


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, MainActivity.class);

        if (v.getId() == R.id.Submit) {
            TextView viewById1 = findViewById(R.id.Submit);


            if (viewById1.getText().equals("Continuer")) {

                intent.putStringArrayListExtra("Wrong", this.wrongAnswerList);
                intent.putParcelableArrayListExtra("difficulty", this.questionList);
                intent.putExtra("index", this.index);
                intent.putExtra("counter", this.counter);
                startActivity(intent);


            } else {

                Intent srcintent = getIntent();
                ArrayList<Question> easylist = srcintent.getParcelableArrayListExtra("difficulty");
                String goodResult = easylist.get(index).getGoodResult();
                RadioGroup viewById2 = findViewById(R.id.RadioGroup);
                int checkedRadioButtonId = viewById2.getCheckedRadioButtonId();
                RadioButton b = findViewById(checkedRadioButtonId);
                TextView submitButton = findViewById(R.id.Submit);

                if (b.getText().equals(goodResult)) {
                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Bonne réponse !");
                    this.counter = this.counter + 1;
                    this.index = this.index + 1;
                    isEndGame();
                    submitButton.setText("Continuer");

                } else {

                    TextView viewById3 = findViewById(R.id.resultTextView);
                    viewById3.setText("Raté. La bonne réponse est : " + goodResult);
                    this.index = this.index + 1;
                    isEndGame();
                    submitButton.setText("Continuer");

                }
            }
        }
    }

    private void isEndGame() {
        Intent srcintent = getIntent();
        ArrayList<Question> easylist = srcintent.getParcelableArrayListExtra("difficulty");
        int size = easylist.size();
        if(this.index==size){
            Intent score = new Intent(this,ScorePage.class);
            score.putExtra("Size",size);
            score.putExtra("CounterGood",this.counter);
            score.putExtra("difficulty",this.difficulty);
            startActivity(score);
            finish();
        }
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
