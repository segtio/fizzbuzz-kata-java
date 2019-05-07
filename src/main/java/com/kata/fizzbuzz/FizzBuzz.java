package com.kata.fizzbuzz;

import java.util.stream.Stream;

import static com.kata.fizzbuzz.enumeration.Constant.values;

public class FizzBuzz {

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        Stream.of(values()).forEach(constant -> {
            if (isDivisibleBy(number, constant.getValue()) || hasDigit(number, constant.getValue())) {
                result.append(constant.getName());
            }
        });
        return (result.length() > 0) ? result.toString() : String.valueOf(number);
    }

    private boolean isDivisibleBy(int number, int digit) {
        return number % digit == 0;
    }

    private boolean hasDigit(int number, int digit) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }
}