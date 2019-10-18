package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"Enter", "1"})
        );
        input.askInt("Enter", 1);
        assertThat(
                out.toString(),
                is(String.format("Please enter valid data again."))
        );
        System.setOut(def);
    }

    @Test
    public void whenInvalidInputDigit() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"2", "1"})
        );
        input.askInt("Enter", 1);
        assertThat(
                out.toString(),
                is(String.format("Please select key from menu.%n"))
        );
        System.setOut(def);
    }

}