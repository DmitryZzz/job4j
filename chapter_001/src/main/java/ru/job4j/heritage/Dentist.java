package ru.job4j.heritage;

public class Dentist extends Doctor {
    public String clinic;

    public Dentist(String name, String surname, String birthday) {
        super(name, surname, birthday);
    }

    public Dentist(String name, String surname, String birthday, String clinic) {
        super(name, surname, birthday);
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }
}
