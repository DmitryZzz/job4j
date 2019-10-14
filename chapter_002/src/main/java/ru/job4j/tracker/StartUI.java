package ru.job4j.tracker;

import java.util.concurrent.locks.Condition;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemByID(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName() + " (" + item.getId() + ")");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        System.out.print("Enter ID: ");
        String id = input.askStr("");
        System.out.print("Enter new name: ");
        String name = input.askStr("");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Элемент успешно обновлен");
        } else {
            System.out.println("Не удалось найти элемент по указанному ID.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        System.out.print("Enter ID: ");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("Элемент успешно удален");
        } else {
            System.out.println("Не удалось найти элемент по указанному ID.");
        }
    }

    public static void findItemByID(Input input, Tracker tracker) {
        System.out.println("=== Find item by ID ====");
        System.out.print("Enter ID: ");
        String id = input.askStr("");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + " (" + item.getId() + ")");
        } else {
            System.out.println("Не удалось найти элемент по указанному ID.");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item[] itemArr = tracker.findByName(name);
        if (itemArr.length != 0) {
            for (Item item : itemArr) {
                System.out.println(item.getName() + " (" + item.getId() + ")");
            }
        } else {
            System.out.println("Не удалось найти элемент(ы) по указанному name.");
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}