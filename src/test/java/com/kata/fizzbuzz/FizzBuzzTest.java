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

    @Test
    public void should_Print_Normal_Numbers() {

        assertThat(fizzBuzz.convert(1)).isEqualTo("1");
        assertThat(fizzBuzz.convert(7)).isEqualTo("7");
        assertThat(fizzBuzz.convert(13)).isNotEqualTo("13");

    }

    @Test
    public void should_print_Fizz_when_Number_divisible_by_three() {
        assertThat(fizzBuzz.convert(3)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(12)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(18)).isEqualTo(Constant.FIZZ.getName());
    }


    @Test
    public void should_print_Buzz_when_Number_divisible_by_five() {
        assertThat(fizzBuzz.convert(5)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(10)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(25)).isEqualTo(Constant.BUZZ.getName());
    }


    @Test
    public void should_print_FizzBuzz_when_Number_divisible_by_three_and_five() {
        assertThat(fizzBuzz.convert(15)).isEqualTo(Constant.FIZZBUZZ.getName());
        assertThat(fizzBuzz.convert(30)).isEqualTo(Constant.FIZZBUZZ.getName());
        assertThat(fizzBuzz.convert(45)).isEqualTo(Constant.FIZZBUZZ.getName());
    }


    @Test
    public void should_print_Fizz_when_Number_contains_three() {
        assertThat(fizzBuzz.convert(23)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(13)).isEqualTo(Constant.FIZZ.getName());
        assertThat(fizzBuzz.convert(31)).isEqualTo(Constant.FIZZ.getName());
    }


    @Test
    public void should_print_Buzz_when_Number_contains_five() {
        assertThat(fizzBuzz.convert(52)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(25)).isEqualTo(Constant.BUZZ.getName());
        assertThat(fizzBuzz.convert(65)).isEqualTo(Constant.BUZZ.getName());
    }
}
