package ru.job4j.oop;

/**
 * Class Student.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 1; i <= 3; i++) {
            petya.song();
            petya.music();
        }

    }
}
