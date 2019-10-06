package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Merge.
 *
 * @author Dmitry Zimin
 * @version 1
 * @since 2019-10-06
 */
public class Merge {

    /**
     * Метод добавляет элементы массивов left и right в третий - rsl.
     *
     * @param left  - массив int
     * @param right -  массив int
     * @return - упорядоченный результирующий массив int из left и right
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int counter = 0;
        while (counter < rsl.length) {
            if (i > left.length - 1) {
                rsl[counter] = right[j];
                j++;
            } else if (j > right.length - 1) {
                rsl[counter] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[counter] = left[i];
                i++;
            } else {
                rsl[counter] = right[j];
                j++;
            }
            counter++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
