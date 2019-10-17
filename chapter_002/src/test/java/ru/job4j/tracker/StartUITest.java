package ru.job4j.tracker;

import org.junit.Test;
import org.hamcrest.core.IsNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(),
                "replaced item"
        };
        new EditAction().execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId()};
        new DeleteAction().execute(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, IsNull.nullValue());
    }

    @Test
    public void whenFindByIDItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Item item2 = new Item("new item2");
        tracker.add(item);
        tracker.add(item2);
        String[] answers = {item.getId()};
        new FindByIDAction().execute(new StubInput(answers), tracker);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first item");
        Item item2 = new Item("second item");
        tracker.add(item1);
        tracker.add(item2);
        String[] answers = {};
        StringBuilder sb = new StringBuilder();
        sb.append(item1.getName() + " (" + item1.getId() + ")\r\n");
        sb.append(item2.getName() + " (" + item2.getId() + ")\r\n");
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new ShowAllAction().execute(new StubInput(answers), tracker);
        System.setOut(stdout);
        assertThat(
                new String(out.toByteArray()),
                is(sb.toString())
        );
    }

    @Test
    public void whenFindByName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0", "new item2", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Item item2 = new Item("new item2");
        tracker.add(item);
        tracker.add(item2);
        item2.setId("12345");
        StubAction action = new StubAction();
        new StartUI().init(input, tracker, new UserAction[]{new FindByNameAction(), action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. === Find item by name ====")
                .add("1. Stub action")
                .add("new item2 (12345)")
                .add("Menu.")
                .add("0. === Find item by name ====")
                .add("1. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}