package com.surbhi.quizapp.spf;

import android.content.Context;
import android.content.SharedPreferences;

public class SpfManager {

    private Context context;
    private SharedPreferences.Editor editor;
    private SharedPreferences spf;

    public SpfManager(Context context) {
        this.context = context;
        spf = context.getSharedPreferences("QuizAppData", Context.MODE_PRIVATE);

    }

    public void setPref(String userName){
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("userName", userName);
        editor.apply();
    }

    public SharedPreferences getPref(){
        return spf;
    }
}
