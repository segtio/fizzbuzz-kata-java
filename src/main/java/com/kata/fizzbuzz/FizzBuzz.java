package com.kata.fizzbuzz;

import com.kata.fizzbuzz.enumeration.Constant;

public class FizzBuzz {

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        for (Constant constant : Constant.values()) {
            if (number % constant.getValue() == 0 || hasDigit(number, constant.getValue())) {
                result.append(constant.getName());
            }
        }
        return (result.length() > 0) ? result.toString() : String.valueOf(number);
    }

    private boolean hasDigit(int number, int digit) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }
}