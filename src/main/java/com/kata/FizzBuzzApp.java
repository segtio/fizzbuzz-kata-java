package com.kata;

import com.kata.fizzbuzz.FizzBuzz;

public class FizzBuzzApp {
    public static void main(String [] args) {
        for (int i = 1; i <= 100 ; i++) {
            FizzBuzz fizzBuzz = new FizzBuzz();
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
