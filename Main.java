package com.trckstr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("Заугольный", "Владислав", "Владимирович", "23.09.1991");
        Person person2 = new Person("Заугольный", "Владислав", "Владимирович");
        person2.setBirthDate("23.09.1991");

        System.out.println("Введите ФИО через пробел");
        String fullName = scanner.nextLine();

        Person person3 = new Person(fullName);

        System.out.println(person1);
        System.out.println(person1.shortName());
        System.out.println(person3);
        System.out.println("Полных лет: " + person1.age());
    }
}