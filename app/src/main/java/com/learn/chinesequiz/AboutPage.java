package com.learn.chinesequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        Intent scrIntent = getIntent();
        String titre = scrIntent.getStringExtra("Titre");
        String team = scrIntent.getStringExtra("Team");
        String name = scrIntent.getStringExtra("Name");

        TextView aproposId = findViewById(R.id.apropos);
        TextView nameTeamId = findViewById(R.id.teamName);
        TextView TeamId = findViewById(R.id.team);

        aproposId.setText(titre);
        nameTeamId.setText(team);
        TeamId.setText(name);




    }
}
