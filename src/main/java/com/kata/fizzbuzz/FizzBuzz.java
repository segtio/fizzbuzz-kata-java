package com.kata.fizzbuzz;

public class FizzBuzz {
    /**
     * FIZZ value
     */
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    static final String FIZZBUZZ = FIZZ + BUZZ;

    /**
     * FizzBuzz converter
     * @param number
     * @return String
     */
    public static String convert(int number) {
        String result = "";

        if (number % 3 == 0 || String.valueOf(number).contains("3"))
            result = FIZZ;
        if (number % 5 == 0)
            result += BUZZ;
        return !result.isEmpty() ? result : String.valueOf(number);
    }
}