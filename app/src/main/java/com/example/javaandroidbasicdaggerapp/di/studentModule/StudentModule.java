package com.example.javaandroidbasicdaggerapp.di.studentModule;

import android.content.Context;

import com.example.javaandroidbasicdaggerapp.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    private Context mContext;

    public StudentModule(Context context){
        mContext = context;
    }

    @Provides
    public Student getStudent(){
        return new Student(mContext);
    }

}
