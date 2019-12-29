package ru.job4j.tracker;

public class TrackerStaticFinalClassLazyLoading {
    private TrackerStaticFinalClassLazyLoading() {
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }
}
