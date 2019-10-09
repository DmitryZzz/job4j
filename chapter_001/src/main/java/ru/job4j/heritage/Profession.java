package ru.job4j.heritage;

public class Profession {
    public String name;
    public String surname;
    public String birthday;

    public Profession(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBirthday() {
        return this.birthday;
    }
}
