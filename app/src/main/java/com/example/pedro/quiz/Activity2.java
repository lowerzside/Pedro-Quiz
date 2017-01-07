package com.example.pedro.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;
import static com.example.pedro.quiz.R.id.question;

public class Activity2 extends AppCompatActivity {
    private Question QuestionLibrary = new Question();
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private TextView question;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mQuestionNumber = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        question = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.A1);
        mButtonChoice2 = (Button) findViewById(R.id.A2);
        mButtonChoice3 = (Button) findViewById(R.id.A3);
        mButtonChoice4 = (Button) findViewById(R.id.A4);
        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    updateQuestion();
                }
                else{
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    updateQuestion();
                }
                else{
                    updateQuestion();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    updateQuestion();
                }
                else{
                    updateQuestion();
                }
                mButtonChoice4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mButtonChoice4.getText() == mAnswer) {
                            updateQuestion();
                        }
                        else{
                            updateQuestion();
                        }
                    }
                });
            }
        });}

    private void updateQuestion() {
        question.setText(Question.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(Question.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(Question.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(Question.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(Question.getChoice4(mQuestionNumber));

        mAnswer = Question.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
}


