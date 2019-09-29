package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean condition1 = ab + ac > bc;
        boolean condition2 = ac + bc > ab;
        boolean condition3 = ab + bc > ac;

        return condition1 && condition2 && condition3;
    }
}