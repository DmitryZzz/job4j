package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((double) (x2 - x1), 2) + Math.pow((double) (y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);

        // Дополнительная проверка 1 : 8.48528137423857
        result = distance(3, 1, 9, -5);
        System.out.println("result (3, 1) to (9, -5) = " + result);

        // Дополнительная проверка 2 : 7.211102550927978
        result = distance(3, 1, 9, 5);
        System.out.println("result (3, 1) to (9, 5) = " + result);
    }
}