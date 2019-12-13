package com.example.javaandroidbasicdaggerapp.di.studentComponent;

import com.example.javaandroidbasicdaggerapp.MainActivity;
import com.example.javaandroidbasicdaggerapp.di.studentModule.StudentModule;

import dagger.Component;

@Component(modules = {StudentModule.class})
public interface StudentComponent {
    public void inject(MainActivity activity);
}
