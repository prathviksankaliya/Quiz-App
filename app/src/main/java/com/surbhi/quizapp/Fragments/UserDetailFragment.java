package com.surbhi.quizapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.surbhi.quizapp.Activities.MainActivity;
import com.surbhi.quizapp.databinding.FragmentUserDetailBinding;
import com.surbhi.quizapp.spf.SpfManager;

public class UserDetailFragment extends Fragment {

    private FragmentUserDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentUserDetailBinding.inflate(getLayoutInflater());

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(binding.edUserName.getText().length() <= 2){
                        binding.edUserName.setError("Enter Valid Name!!");
                        binding.edUserName.requestFocus();
                    }else{
                        SpfManager spfManager = new SpfManager(requireContext());
                        spfManager.setPref(binding.edUserName.getText().toString());
                        startActivity(new Intent(requireContext(), MainActivity.class));
                        requireActivity().finish();
                    }

            }
        });

        return binding.getRoot();
    }
}