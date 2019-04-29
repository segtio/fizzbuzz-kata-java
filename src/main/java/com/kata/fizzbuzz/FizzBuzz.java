package com.kata.fizzbuzz;

public class FizzBuzz {
    /**
     * FIZZ value
     */
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";

    /**
     * FizzBuzz converter
     * @param number
     * @return String
     */
    public static String convert(int number) {
        if (number % 3 == 0)
            return FIZZ;
        if (number % 5 == 0)
            return BUZZ;
        return String.valueOf(number);
    }
}
