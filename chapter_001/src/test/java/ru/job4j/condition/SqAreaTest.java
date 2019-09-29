package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {

        double expected, out;

        // 1. p = 4, k = 1, s = 1.0
        expected = 1.0;
        out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);

        // 2. p = 6, k = 2, s = 2.0
        expected = 2.0;
        out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);

    }
}
