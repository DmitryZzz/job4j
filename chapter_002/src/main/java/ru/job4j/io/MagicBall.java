package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String resp = input.nextLine();
        System.out.println("Ответ: " + MagicBall.getAnswer());
    }

    public static String getAnswer() {
        int answer = new Random().nextInt(3);
        String result = "Может быть";
        if (answer == 1) {
            result = "Да";
        } else if (answer == 2) {
            result = "Нет";
        }
        return result;
    }
}