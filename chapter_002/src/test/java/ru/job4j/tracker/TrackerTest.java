package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteOnIDSuccess() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item);
        tracker.add(item2);
        Boolean result = tracker.delete(item2.getId());
        assertThat(result, is(true));
    }

    @Test
    public void whenDeleteOnIDFail() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item);
        tracker.add(item2);
        Boolean result = tracker.delete("test3333");
        assertThat(result, is(false));
    }

    @Test
    public void whenFindSuccess() {
        Tracker tracker = new Tracker();
        for (int index = 0; index < 10; index++) {
            tracker.add(new Item("Test" + index));
        }
        int expected = 10;
        int result = tracker.findAll().length;
        assertThat(result, is(expected));
    }


    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        for (int index = 0; index < 10; index++) {
            tracker.add(new Item("Test" + index));
        }
        for (int index = 0; index < 5; index++) {
            tracker.add(new Item("Test" + index));
        }
        int expected = 2;
        int result = tracker.findByName("Test4").length;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCreateTrackerEnumThenItIsSingletone() {
        Tracker tracker1 = TrackerEnum.INSTANCE.tracker;
        Tracker tracker2 = TrackerEnum.INSTANCE.tracker;
        assertSame(tracker1, tracker2);
    }

    @Test
    public void whenCreateTrackerStaticFieldLazyLoadingThenItIsSingletone() {
        Tracker tracker1 = TrackerStaticFieldLazyLoading.getInstance();
        Tracker tracker2 = TrackerStaticFieldLazyLoading.getInstance();
        assertSame(tracker1, tracker2);
    }

    @Test
    public void whenCreateTrackerStaticFinalFieldEagerLoadingThenItIsSingletone() {
        Tracker tracker1 = TrackerStaticFinalFieldEagerLoading.getInstance();
        Tracker tracker2 = TrackerStaticFinalFieldEagerLoading.getInstance();
        assertSame(tracker1, tracker2);
    }

    @Test
    public void whenCreateTrackerStaticFinalClassLazyLoadingThenItIsSingletone() {
        Tracker tracker1 = TrackerStaticFinalClassLazyLoading.getInstance();
        Tracker tracker2 = TrackerStaticFinalClassLazyLoading.getInstance();
        assertSame(tracker1, tracker2);
    }

}