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
        if (number % 3 == 0 && number % 5 == 0)
            return FIZZBUZZ;
        if (number % 3 == 0)
            return FIZZ;
        if (number % 5 == 0)
            return BUZZ;
        return String.valueOf(number);
    }
}
