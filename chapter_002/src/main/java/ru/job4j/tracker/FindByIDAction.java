package ru.job4j.tracker;

public class FindByIDAction implements UserAction {

    @Override
    public String name() {
        return "=== Find item by ID ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + " (" + item.getId() + ")");
        } else {
            System.out.println("Не удалось найти элемент по указанному ID.");
        }
        return true;
    }
}
