package com.kata;

import com.kata.fizzbuzz.FizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzzApp {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream.range(1, 100).forEach(i -> System.out.println(fizzBuzz.convert(i)));
    }
}
