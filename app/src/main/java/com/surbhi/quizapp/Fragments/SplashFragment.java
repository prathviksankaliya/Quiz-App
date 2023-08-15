package com.surbhi.quizapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.surbhi.quizapp.Activities.MainActivity;
import com.surbhi.quizapp.R;
import com.surbhi.quizapp.spf.SpfManager;

public class SplashFragment extends Fragment {

    private SpfManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_splash, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                manager = new SpfManager(requireContext());
                if (manager.getPref().getString("userName", null) != null) {
                    startActivity(new Intent(requireContext(), MainActivity.class));
                    requireActivity().finish();
                } else {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.frContainer, new UserDetailFragment()).commit();
                }
            }
        }, 1200);

        return view;
    }
}