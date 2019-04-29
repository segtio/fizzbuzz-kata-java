package com.kata.fizzbuzz;

import com.kata.fizzbuzz.enumeration.Constant;

public class FizzBuzz {

    /**
     * FizzBuzz converter
     * @param number
     * @return String
     */
    public String convert(int number) {
        String result = "";

        if (number % Constant.FIZZ.getValue() == 0 || hasDigit(number, Constant.FIZZ.getValue()))
            result = Constant.FIZZ.getName();
        if (number % Constant.BUZZ.getValue() == 0 || hasDigit(number, Constant.BUZZ.getValue()))
            result += Constant.BUZZ.getName();
        return !result.isEmpty() ? result : String.valueOf(number);
    }

    /**
     * Returns true if number has the given digit, false it not
     * @param number
     * @param digit
     * @return boolean
     */
    private boolean hasDigit(int number, int digit) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }
}