package com.surbhi.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.surbhi.quizapp.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    private ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int correctAnswer = getIntent().getIntExtra("correctAnswer", -1);
        int wrongAnswer = getIntent().getIntExtra("wrongAnswer", -1);
        String subjectName = getIntent().getStringExtra("subjectName");

        binding.txCorrectAnswer.setText(String.valueOf("Correct Answers: " +  correctAnswer));
        binding.txWrongAnswer.setText(String.valueOf("Wrong Answers: " +  wrongAnswer));
        binding.txSubjectName.setText(subjectName);
        if(subjectName.equals("Maths")){
            binding.igQuiz.setImageResource(R.drawable.math);
        }else if(subjectName.equals("Java")){
            binding.igQuiz.setImageResource(R.drawable.java);
        }else if(subjectName.equals("CLang")){
            binding.igQuiz.setImageResource(R.drawable.clang);
        }else if(subjectName.equals("OOPS")){
            binding.igQuiz.setImageResource(R.drawable.oops);
        }else if(subjectName.equals("Science")){
            binding.igQuiz.setImageResource(R.drawable.science);
        }

        binding.btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
                finish();
            }
        });

    }
}