package ru.job4j.tracker;

import sun.plugin2.gluegen.runtime.StructAccessor;

import javax.sound.midi.Track;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод должен заменить ячейку в массиве this.items.
     *
     * @param id   id необходимой заявки
     * @param item на что меняем, если найдем по id
     * @return результат операции boolean
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                item.setId(id);
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод должен удалить ячейку в массиве this.items.
     *
     * @param id id удаляемого элемента
     * @return результат операции boolean
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                items[index] = null;
                System.arraycopy(items, index + 1, this.items, index, items.length - index - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов.
     *
     * @return массив без null
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод возвращает массив из найденных по полю name элементов.
     *
     * @param key имя элемента
     * @return массив из найденных по полю name элементов
     */
    public Item[] findByName(String key) {
        Item[] destArr = new Item[position + 1];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index] != null && items[index].getName().equals(key)) {
                destArr[size++] = items[index];
            }
        }
        return Arrays.copyOf(destArr, size);
    }

    /**
     * Метод возвращает элемент по id.
     *
     * @param id id искомого элемента
     * @return найденный элемент или null
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public void showArr(Item[] arr) {
        for (Item i : arr) {
            if (i == null) {
                System.out.println("null");
            } else {
                System.out.println(i.getName());
            }
        }
    }
}