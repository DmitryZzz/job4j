package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height <= 0) ? 0 : (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height <= 0) ? 0 : (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(185);
        System.out.println("Man 185 is " + man);

        double woman = womanWeight(160);
        System.out.println("Woman 160 is " + woman);
    }

}