package com.kata.fizzbuzz;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    /**
     * Should Print Normal Numbers
     * #inputs : 1|7|13|31
     * #output : "1"|"7"|"13"|"31"
     */
    @Test
    public void shouldPrintNormalNumbers() {

        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
        assertThat(FizzBuzz.convert(7)).isEqualTo("7");
        assertThat(FizzBuzz.convert(13)).isEqualTo("13");
        assertThat(FizzBuzz.convert(31)).isEqualTo("31");

    }
}
