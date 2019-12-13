package com.example.javaandroidbasicdaggerapp;

import android.content.Context;
import android.widget.Toast;

public class Student {
    private Context mContext;

    public Student(Context context){
        mContext = context;
    }

    public void displayStudent(){
        Toast.makeText(mContext, "Student Displayed", Toast.LENGTH_LONG).show();
    }

}
