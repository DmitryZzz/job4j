package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {

        double expected, out;

        // 1. result (0, 0) to (2, 0) = 2.0
        expected = 2.0;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);

        // 2. result (3, 1) to (9, -5) = 8.48528137423857
        expected = 8.48;
        first = new Point(3, 1);
        second = new Point(9, -5);
        out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);

        // 3. result (3, 1) to (9, 5) = 7.211102550927978
        expected = 7.21;
        first = new Point(3, 1);
        second = new Point(9, 5);
        out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

}
