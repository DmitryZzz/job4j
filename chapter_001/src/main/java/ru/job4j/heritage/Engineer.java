package ru.job4j.heritage;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String birthday) {
        super(name, surname, birthday);
    }

    public Education education() {
        return new Education();
    }
}