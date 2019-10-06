package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        int halfP = p / 2;
        double h = halfP / (k + 1);
        double l = h * k;
        return h * l;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        result = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}