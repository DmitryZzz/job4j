package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pcs = 11;
        int player = 1;

        while (pcs > 0) {
            boolean run = true;
            while (run) {
                System.out.print("Игрок " + player + " возьмите со стола от 1 до 3 спичек: ");
                int get = Integer.valueOf(input.nextLine());
                if (get >= 1 && get <= 3) {
                    run = false;
                    pcs -= get;
                    System.out.println("Осталось " + Math.max(0, pcs) + " спичек.");
                    if (pcs <= 0) {
                        System.out.println("Игрок " + player + " победил!");
                    }
                    player = (player == 1) ? 2 : 1;
                } else {
                    System.out.println("Выбрано неправильное количество, попробуйте еще");
                }
            }
        }
    }
}