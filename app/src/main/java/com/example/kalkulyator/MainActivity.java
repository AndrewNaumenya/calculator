package com.example.kalkulyator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    private static final String SCORE_KEY = "SCORE_KEY";
    private TextView textScore;
    private EditText nameEdit;
    private EditText nameEditOne;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private double a;
    private double b;
    private double score;
    private long score1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textScore = findViewById(R.id.textScore);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultyply);
        buttonDivide = findViewById(R.id.buttonDivide);
        nameEdit = findViewById(R.id.nameEdit);
        nameEditOne = findViewById(R.id.nameEditOne);


        buttonPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                String name = nameEdit.getText().toString();
                String name1 = nameEditOne.getText().toString();
                if (name.isEmpty())
                    Toast.makeText(getApplicationContext(),"Введи первое число",Toast.LENGTH_LONG).show();
                else {

                        a = new Double(name);
                        if (name1.isEmpty())
                            Toast.makeText(getApplicationContext(),"Введи второе число",Toast.LENGTH_LONG).show();
                        else{

                                b = new Double(name1);

                            score = a+b;
                            score*=1000000000000L;
                            score = (long) score;
                            if (score%10>4){
                                score/=10L;
                                score = (long) score+1;
                                score/=100000000000L;
                            }
                            else
                                score/=1000000000000L;
                            textScore.setText(""+score);
                            score1 = (long) score;
                            if (score1 == score){
                                textScore.setText(""+score1);}
                            else
                                textScore.setText(""+score);
                                }

                }

            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                String name = nameEdit.getText().toString();
                String name1 = nameEditOne.getText().toString();
                if (name.isEmpty())
                    Toast.makeText(getApplicationContext(),"Введи первое число",Toast.LENGTH_LONG).show();
                else {

                        a = new Double(name);
                        if (name1.isEmpty())
                            Toast.makeText(getApplicationContext(),"Введи второе число",Toast.LENGTH_LONG).show();
                        else{

                                b = new Double(name1);

                            score = a-b;
                            score*=1000000000000L;
                            score = (long) score;
                            if (score%10>4){
                                score/=10L;
                                score = (long) score+1;
                                score/=100000000000L;
                            }
                            else
                                score/=1000000000000L;
                            score1 = (long) score;
                            if (score1 == score){
                                textScore.setText(""+score1);}
                            else
                                textScore.setText(""+score);

                        }

                }

            }
        });



        buttonMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                String name = nameEdit.getText().toString();
                String name1 = nameEditOne.getText().toString();
                if (name.isEmpty())
                    Toast.makeText(getApplicationContext(),"Введи первое число",Toast.LENGTH_LONG).show();
                else {

                        a = new Double(name);
                        if (name1.isEmpty())
                            Toast.makeText(getApplicationContext(),"Введи второе число",Toast.LENGTH_LONG).show();
                        else{

                                b = new Double(name1);

                            score = a*b;
                            score*=1000000000000L;
                            score = (long) score;
                            if (score%10>4){
                                score/=10L;
                                score = (long) score+1;
                                score/=100000000000L;
                            }
                            else
                                score/=1000000000000L;

                            score1 = (long) score;
                            if (score1 == score){
                                textScore.setText(""+score1);}
                            else
                                textScore.setText(""+score);
                        }

                }

            }
        });



        buttonDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                String name = nameEdit.getText().toString();
                String name1 = nameEditOne.getText().toString();
                if (name.isEmpty())
                    Toast.makeText(getApplicationContext(),"Введи первое число",Toast.LENGTH_LONG).show();
                else {

                        a = new Double(name);
                        if (name1.isEmpty())
                            Toast.makeText(getApplicationContext(),"Введи второе число",Toast.LENGTH_LONG).show();
                        else{

                                    b = new Double(name1);

                            score = a/b;
                            score*=1000000000000L;
                            score = (long) score;
                            if (score%10>4){
                                score/=10L;
                                score = (long) score+1;
                                score/=100000000000L;
                            }
                            else
                                score/=1000000000000L;
                            if (b!=0){
                                score1 = (long) score;
                            if (score1 == score){
                                textScore.setText(""+score1);}
                            else
                                textScore.setText(""+score);}
                            else
                                textScore.setText("Ошибка");
                        }

                }

            }
        });


    }






    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_KEY, (int) score);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt(SCORE_KEY, 0);
        textScore.setText(valueOf(score));
    }
}