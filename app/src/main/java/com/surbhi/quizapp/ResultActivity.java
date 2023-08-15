package com.surbhi.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        binding.txResult.setText("correctAnswer: "+correctAnswer + "\n" +
                "wrongAnswer: "+wrongAnswer + "\n" + "Subject Name: " + subjectName);

    }
}