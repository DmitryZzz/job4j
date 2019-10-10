package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan Ivanovich");
        student.setGroup("TM-2");
        student.setDate(new Date());

        System.out.println("Name: " + student.getName() + ". Group: " + student.getGroup()
                + ". Date: " + student.getDate());
    }
}
