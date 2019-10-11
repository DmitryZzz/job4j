package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book jungleBook = new Book("Jungle book", 100);
        Book fightClub = new Book("Fight club", 140);
        Book hobbit = new Book("Hobbit", 190);
        Book cleanCode = new Book("Clean code", 300);
        Book[] bookArr = new Book[4];

        bookArr[0] = jungleBook;
        bookArr[1] = fightClub;
        bookArr[2] = hobbit;
        bookArr[3] = cleanCode;
        showArr(bookArr);

        Book tmp = bookArr[0];
        bookArr[0] = bookArr[3];
        bookArr[3] = tmp;

        System.out.println();
        System.out.println("Switch [0] and [3]");
        showArr(bookArr);

        System.out.println();
        System.out.println("Only \"Clean code\"");

        showArr(bookArr, "Clean code");
    }

    private static void showArr(Book[] bookArr) {
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println("Book name: " + bookArr[i].getName() + ". Pages: " + bookArr[i].getPages());
        }
    }

    private static void showArr(Book[] bookArr, String name) {
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i].getName().equals(name)) {
                System.out.println("Book name: " + bookArr[i].getName() + ". Pages: " + bookArr[i].getPages());
            }
        }
    }
}