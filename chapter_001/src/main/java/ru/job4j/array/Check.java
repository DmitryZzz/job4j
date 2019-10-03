package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length == 0) { // проверка на пустой массив
            return false;
        }

        boolean statement = data[0]; // эталонное значение
        for (int i = 1; i < data.length; i++) {
            if (data[i] != statement) {
                result = false;
                break;
            }
        }
        return result;
    }
}