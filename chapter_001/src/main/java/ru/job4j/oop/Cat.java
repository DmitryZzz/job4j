package ru.job4j.oop;

/**
 * Class Cat.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class Cat {

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says: " + say);
    }
}
