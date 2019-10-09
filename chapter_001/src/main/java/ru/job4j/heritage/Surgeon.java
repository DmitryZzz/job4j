package ru.job4j.heritage;

public class Surgeon extends Doctor {
    public String specialization;

    public Surgeon(String name, String surname, String birthday) {
        super(name, surname, birthday);
    }

    public Surgeon(String name, String surname, String birthday, String specialization) {
        super(name, surname, birthday);
        this.specialization = specialization;
    }

    public String location() {
        Hospital hospital = new Hospital();
        return hospital.getLocation();
    }

    public static void main(String[] args) {
        Surgeon s = new Surgeon("Tom", "Hanks", "1970");
        System.out.println("Name: " + s.getName() + ". Surname: " + s.getSurname() + ". Bday: "
                + s.getBirthday());

        s = new Surgeon("Tom", "Hanks", "1970", "onko");
        System.out.println("Name: " + s.getName() + ". Surname: " + s.getSurname() + ". Bday: "
                + s.getBirthday() + ". Spec: " + s.specialization);
    }
}
