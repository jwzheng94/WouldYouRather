package com.example.aaaaa_000.wouldyourather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseObject;

public class AskQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_question);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //     public void onClick(View view) {
        //       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //               .setAction("Action", null).show();
        //   }
        //});
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text1 = (EditText) findViewById(R.id.answer1);
                EditText text2 = (EditText) findViewById(R.id.answer2);

                String answer1 = text1.getText().toString();
                String answer2 = text2.getText().toString();

                ParseObject question = new ParseObject("Questions");
                question.put("firstOption", answer1);
                question.put("secondOption", answer2);
                question.put("countFirst", 0);
                question.put("countSecond", 0);
                question.saveInBackground();
                
                Intent i = new Intent(getApplicationContext(), AskResultActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}