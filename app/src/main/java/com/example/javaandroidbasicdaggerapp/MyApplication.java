package com.example.javaandroidbasicdaggerapp;

import android.app.Application;

import com.example.javaandroidbasicdaggerapp.di.studentComponent.DaggerStudentComponent;
import com.example.javaandroidbasicdaggerapp.di.studentComponent.StudentComponent;
import com.example.javaandroidbasicdaggerapp.di.studentModule.StudentModule;

public class MyApplication extends Application {

    private StudentComponent mStudentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mStudentComponent = DaggerStudentComponent.builder().studentModule(new StudentModule(this)).build();
    }

    public StudentComponent getStudentComponent(){
        return mStudentComponent;
    }
}
