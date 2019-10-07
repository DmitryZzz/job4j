package ru.job4j.oop;

/**
 * Class JukeBox.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-07
 */
public class JukeBox {

    public void music(int position) {
        String result = "Песня не найдена";
        if (position == 1) {
            result = "Пусть бегут неуклюже";
        } else if (position == 2) {
            result = "Спокойной ночи";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        JukeBox jb = new JukeBox();
        jb.music(1);
        jb.music(2);
        jb.music(3);
    }
}
