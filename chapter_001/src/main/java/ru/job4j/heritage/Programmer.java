package ru.job4j.heritage;

public class Programmer extends Engineer {
    public String language;
    public boolean knowsSQL;

    public Programmer(String name, String surname, String birthday) {
        super(name, surname, birthday);
    }

    public Programmer(String name, String surname, String birthday, String language) {
        super(name, surname, birthday);
        this.language = language;
    }

    public String getlanguage() {
        return language;
    }

    public boolean getKnowsSQL() {
        return knowsSQL;
    }
}
