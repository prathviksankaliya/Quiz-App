package com.surbhi.quizapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.surbhi.quizapp.Fragments.SplashFragment;
import com.surbhi.quizapp.R;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frContainer, new SplashFragment()).commit();
    }
}