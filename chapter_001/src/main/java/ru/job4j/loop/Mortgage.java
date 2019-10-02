package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {

        int year = 0;
        double rest, debt;

        debt = amount + (amount / 100 * percent);

        while (debt > 0) {
            year++;
            rest = debt - salary;
            debt = (rest / 100 * percent) + rest;
        }
        return year;
    }
}