package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itemArr = tracker.findByName(name);
        if (itemArr.length != 0) {
            for (Item item : itemArr) {
                System.out.println(item.getName() + " (" + item.getId() + ")");
            }
        } else {
            System.out.println("Не удалось найти элемент(ы) по указанному name.");
        }
        return true;
    }
}
