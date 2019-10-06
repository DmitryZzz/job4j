package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void test(int in, int expected, int out, String currency) {
        boolean passed = expected == out;
        System.out.println(in + " " + currency + " are " + out + ". Test result : " + passed);
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + rubleToEuro(140) + " euro.");
        System.out.println("180 rubles are " + rubleToDollar(180) + " dollars.");
        System.out.println("10 euros are " + euroToRuble(10) + " rubles.");
        System.out.println("25 dollars are " + dollarToRuble(25) + " rubles.");
        System.out.println();
        System.out.println("Tests:");
        test(140, 2, rubleToEuro(140), "rubles");
        test(180, 3, rubleToDollar(180), "rubles");
        test(10, 700, euroToRuble(10), "euros");
        test(25, 1500, dollarToRuble(25), "dollars");
    }
}