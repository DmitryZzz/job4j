package ru.job4j.tracker;

public class TrackerStaticFinalFieldEagerLoading {
    private final static Tracker INSTANCE = new Tracker();

    private TrackerStaticFinalFieldEagerLoading() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}
