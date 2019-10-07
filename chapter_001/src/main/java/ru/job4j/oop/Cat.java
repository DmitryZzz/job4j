package ru.job4j.oop;

/**
 * Class Cat.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Котик " + this.name + " съел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}
