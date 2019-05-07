package com.kata.fizzbuzz.enumeration;

public enum Constant {
    FIZZ("Fizz", 3),
    BUZZ("Buzz", 5);

    private String name;
    private int value;

    Constant(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
