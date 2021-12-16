package com.example.koindi.java.di;

import com.example.koindi.di.component.HelloRepository;

public class MyJavaPresenter {
    private final HelloRepository repository;

    public MyJavaPresenter(HelloRepository repository) {
        this.repository = repository;
    }

    public String sayHello() {
        return repository.giveHello() + "from " + this;
    }
}
