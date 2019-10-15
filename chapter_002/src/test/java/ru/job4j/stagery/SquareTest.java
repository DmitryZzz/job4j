package ru.job4j.stagery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void drawSquare() {
        Square square = new Square();
        assertThat(square.draw(),
                is(new StringBuilder()
                        .append("++++\n")
                        .append("+  +\n")
                        .append("+  +\n")
                        .append("++++\n")
                        .toString()));
    }
}