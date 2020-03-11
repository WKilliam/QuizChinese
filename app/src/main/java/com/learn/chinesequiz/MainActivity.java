package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Question question = new Question("combien fait 2x2 ?",
                "4",
                "5",
                "2",
                "1",
                0,
                0,
                0);

        TextView viewById = findViewById(R.id.boxQuestion);

        RadioButton viewById1 = findViewById(R.id.Choice1);

        View viewById2 = findViewById(R.id.RadioGroup);

        viewById1.setText(question.getBadResult());

        viewById.setText(question.getQuestion());

    }
}
