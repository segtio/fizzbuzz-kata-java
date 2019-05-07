package com.kata.fizzbuzz;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kata.fizzbuzz.enumeration.Constant.BUZZ;
import static com.kata.fizzbuzz.enumeration.Constant.FIZZ;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @Parameters({"1", "44", "79"})
    public void should_print_no_Fizz_nor_Buzz_numbers(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(String.valueOf(number));
    }

    @Test
    @Parameters({"3", "12", "18"})
    public void should_print_Fizz_when_number_divisible_by_three(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(FIZZ.getName());
    }

    @Test
    @Parameters({"5", "10", "25"})
    public void should_print_Buzz_when_number_divisible_by_five(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(BUZZ.getName());
    }

    @Test
    @Parameters({"15", "30", "45"})
    public void should_print_FizzBuzz_when_number_divisible_by_three_and_five(int number) {
        String FIZZBUZZ = FIZZ.getName() + BUZZ.getName();
        assertThat(fizzBuzz.convert(number)).isEqualTo(FIZZBUZZ);
    }

    @Test
    @Parameters({"23", "13", "31"})
    public void should_print_Fizz_when_Number_contains_three(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(FIZZ.getName());
    }

    @Test
    @Parameters({"52", "25", "65"})
    public void should_print_Buzz_when_number_contains_five(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(BUZZ.getName());
    }
}
