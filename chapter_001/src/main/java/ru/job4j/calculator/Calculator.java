package ru.job4j.calculator;

/**
 * Calculate.
 *
 * @author Dmitry Zimin (yes.zimin@gmail.com)
 */

public class Calculator {

    /**
     * Сложение чисел: first + second.
     *
     * @param first  - число
     * @param second - число
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление чисел: first / second
     *
     * @param first  - число
     * @param second - число
     */
    public static void div(double first, double second) {
        double result = 0;
        if (second != 0) {
            result = (first / second);
        }
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Произведение чисел: first * second
     *
     * @param first  - число
     * @param second - число
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Разность чисел: first - second
     *
     * @param first  - число
     * @param second - число
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
