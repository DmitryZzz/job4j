package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student freshmanStudent = freshman;
        Object freshmanObject = freshmanStudent;
    }
}