package com.example.guggig.exitpoll;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);



        Button deleteScore = findViewById(R.id.butt_clear);
        deleteScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


    }
}
