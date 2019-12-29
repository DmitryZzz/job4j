package ru.job4j.tracker;

public class TrackerStaticFieldLazyLoading {
    private static Tracker instance;

    private TrackerStaticFieldLazyLoading() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
