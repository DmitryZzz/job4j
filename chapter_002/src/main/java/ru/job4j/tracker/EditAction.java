package ru.job4j.tracker;

public class EditAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        String name = input.askStr("Enter new name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Элемент успешно обновлен");
        } else {
            System.out.println("Не удалось найти элемент по указанному ID.");
        }
        return true;
    }
}
