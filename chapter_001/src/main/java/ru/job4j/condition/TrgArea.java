package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {

        // Полупериметр вычисляется как сумма всех сторон поделенная на 2.
        double p = (a + b + c) / 2;

        // Формула вычисления площади треугольника
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}