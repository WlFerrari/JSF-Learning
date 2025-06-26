package com.example.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("counterTwo")
@ApplicationScoped
public class CounterTwo {
    private int value = 0;

    public String increment() {
        value++;

        return "student_three";
    }

    public CounterTwo() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
