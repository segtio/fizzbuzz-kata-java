package com.kata.fizzbuzz;

public class FizzBuzz {
    /**
     * FIZZ value
     */
    public static final String FIZZ = "Fizz";

    /**
     * FizzBuzz converter
     * @param number
     * @return String
     */
    public static String convert(int number) {
        if (number % 3 == 0)
            return FIZZ;
        return String.valueOf(number);
    }
}
