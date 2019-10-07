package ru.job4j.oop;

/**
 * Class DummyDic.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String word = "table";
        System.out.println(dic.engToRus(word));
    }
}
