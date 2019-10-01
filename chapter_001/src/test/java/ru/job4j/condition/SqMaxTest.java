package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        int expected = 6;
        int s = SqMax.max(6, 2,3,4);
        assertThat(s, is(expected));
    }

    @Test
    public void whenSecondMax() {
        int expected = 6;
        int s = SqMax.max(2, 6,3,4);
        assertThat(s, is(expected));
    }

    @Test
    public void whenThirdMax() {
        int expected = 8;
        int s = SqMax.max(6, 2,8,4);
        assertThat(s, is(expected));
    }

    @Test
    public void whenFourthMax() {
        int expected = 6;
        int s = SqMax.max(2, 2,3,6);
        assertThat(s, is(expected));
    }

    @Test
    public void whenAllEqual() {
        int expected = 6;
        int s = SqMax.max(6, 6,6,6);
        assertThat(s, is(expected));
    }
}