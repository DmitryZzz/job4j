package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {

        // Найдем h, используя формулы:
        // p = 2 * (L + h);
        // L = h * k;

        // p/2 = L + h;
        // p/2 = (h * k) + h;
        // h = p/2 / (k + 1);

        int halfP = p / 2;
        double h = halfP / (k + 1);
        double L = h * k;

        return h * L;

    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);

        result = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);

    }
}