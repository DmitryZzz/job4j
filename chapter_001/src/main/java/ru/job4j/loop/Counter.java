package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        while (start <= finish) {
            if (start % 2 == 0) {
                sum += start;
            }
            start++;
        }
        return sum;
    }
}