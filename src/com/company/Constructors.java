package com.company;

import java.util.Date;
import java.util.Scanner;

public class Constructors {
    public static void main(String[] args) {

        System.out.println("Create new person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your firstname: ");
        String firstName = scanner.nextLine();
        System.out.println("Input your lastname: ");
        String lastName = scanner.nextLine();


        Person person = new Person(firstName, lastName);
        System.out.println(person.toString());

    }
}
enum TypeSex{MALE, FEMALE, UNDEFINED};

