package com.kata.fizzbuzz;


import com.kata.fizzbuzz.enumeration.Constant;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    /**
     * Should Print Normal Numbers
     * #inputs : 1|7|13
     * #output : "1"|"7"|"Fizz"
     */
    @Test
    public void shouldPrintNormalNumbers() {

        assertThat(fizzBuzz.convert(1)).isEqualTo("1");
        assertThat(fizzBuzz.convert(7)).isEqualTo("7");
        assertThat(fizzBuzz.convert(13)).isNotEqualTo("13");

    }

    /**
     * Should Print Fizz For Divisible By Three Numbers
     * #inputs : 3|12|18
     * #output : "Fizz"|"Fizz"|"Fizz"
     */
    @Test
    public void shouldPrintFizzForDivisibleByThreeNumbers() {
        assertThat(fizzBuzz.convert(3)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(12)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(18)).isEqualTo(Constant.FIZZ.getName());
    }

    /**
     * Should Print Buzz For Divisible By Three Numbers
     * #inputs : 5|10|25
     * #output : "Buzz"|"Buzz"|"Buzz"
     */
    @Test
    public void shouldPrintBuzzForDivisibleByFiveNumbers() {
        assertThat(fizzBuzz.convert(5)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(10)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(25)).isEqualTo(Constant.BUZZ.getName());
    }

    /**
     * Should Print FizzBuzz For Divisible By Three Numbers And Five
     * #inputs : 15|30|45
     * #output : "FizzBuzz"|"FizzBuzz"|"FizzBuzz"
     */
    @Test
    public void shouldPrintFizzBuzzForDivisibleByThreeAndFiveNumbers() {
        assertThat(fizzBuzz.convert(15)).isEqualTo(Constant.FIZZBUZZ.getName());
        assertThat(fizzBuzz.convert(30)).isEqualTo(Constant.FIZZBUZZ.getName());
        assertThat(fizzBuzz.convert(45)).isEqualTo(Constant.FIZZBUZZ.getName());
    }

    /**
     * Should Print Fizz For Numbers That Contain Three
     * #inputs : 23|13|31
     * #output : "Fizz"|"Fizz"|"Fizz"
     */
    @Test
    public void shouldPrintFizzForNumbersThatContainThree() {
        assertThat(fizzBuzz.convert(23)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(13)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(31)).isEqualTo(Constant.FIZZ.getName());
    }

    /**
     * Should Print Buzz For Numbers That Contain Three
     * #inputs : 51|25|65
     * #output : "Buzz"|"Buzz"|"Buzz"
     */
    @Test
    public void shouldPrintBuzzForNumbersThatContainFive() {
        assertThat(fizzBuzz.convert(52)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(25)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(65)).isEqualTo(Constant.BUZZ.getName());
    }
}
