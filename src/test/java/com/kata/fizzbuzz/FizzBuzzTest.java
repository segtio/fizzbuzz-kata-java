package com.kata.fizzbuzz;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    /**
     * Should Print Normal Numbers
     * #inputs : 1|7|13
     * #output : "1"|"7"|"13"
     */
    @Test
    public void shouldPrintNormalNumbers() {

        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
        assertThat(FizzBuzz.convert(7)).isEqualTo("7");
        assertThat(FizzBuzz.convert(13)).isEqualTo("13");

    }

    /**
     * Should Print Fizz For Divisible By Three Numbers
     * #inputs : 3|12|18
     * #output : "Fizz"|"Fizz"|"Fizz"
     */
    @Test
    public void shouldPrintFizzForDivisibleByThreeNumbers() {
        assertThat(FizzBuzz.convert(3)).isEqualTo(FizzBuzz.FIZZ);
        assertThat(FizzBuzz.convert(12)).isEqualTo(FizzBuzz.FIZZ);
        assertThat(FizzBuzz.convert(18)).isEqualTo(FizzBuzz.FIZZ);
    }

    /**
     * Should Print Fizz For Divisible By Three Numbers
     * #inputs : 5|10|25
     * #output : "Buzz"|"Buzz"|"Buzz"
     */
    @Test
    public void shouldPrintFizzForDivisibleByFiveNumbers() {
        assertThat(FizzBuzz.convert(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.convert(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.convert(25)).isEqualTo("Buzz");
    }
}
