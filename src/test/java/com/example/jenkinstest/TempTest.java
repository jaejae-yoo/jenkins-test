package com.example.jenkinstest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TempTest {

    @Test
    void test1() {
        int number = 1;

        assertThat(number).isEqualTo(1);
    }

    @Test
    void test2() {
        int number = 1;

        assertThat(number).isEqualTo(1);
    }
}
