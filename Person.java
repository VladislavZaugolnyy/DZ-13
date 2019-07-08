package com.trckstr;

public class Person {

    private String lastName;
    private String name;
    private String patronymic;
    private String birthDate;

    public Person(String lastName, String name, String patronymic, String birthDate) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public Person(String lastName, String name, String patronymic) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person (String fullName) {
            String[] fullNameArray = fullName.split("\\s");
            this.lastName = fullNameArray[0];
            this.name = fullNameArray[1];
            this.patronymic = fullNameArray[2];
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String shortName() {
        String shortName = lastName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
        return shortName;
    }

    public int age() {
        String[] birthDateArray = birthDate.split("\\.");
        int age = 2019 - Integer.parseInt(birthDateArray[2]);
        return age;
    }

    @Override
    public String toString() {
        return lastName + " " + name + " " + patronymic;
    }
}

