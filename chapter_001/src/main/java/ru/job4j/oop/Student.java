package ru.job4j.oop;

/**
 * Class Student.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class Student {

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {
        System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        for (int i = 1; i <= 3; i++) {
            petya.song();
            petya.music(song);
        }

    }
}
