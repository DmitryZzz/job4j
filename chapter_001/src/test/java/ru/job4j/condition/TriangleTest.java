package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void findArea() {
        Point a = new Point(11, 10);
        Point b = new Point(10, 0);
        Point c = new Point(20, 20);
        Triangle triangle = new Triangle(a, b, c);
        double result = 39.98;
        double expect = triangle.area();
        assertEquals(result, expect, 0.02);
    }

    @Test
    public void notExist() {
        Point a = new Point(11, 00);
        Point b = new Point(10, 0);
        Point c = new Point(20, 00);
        Triangle triangle = new Triangle(a, b, c);
        double result = -1;
        double expect = triangle.area();
        assertEquals(result, expect, 0.02);
    }
}