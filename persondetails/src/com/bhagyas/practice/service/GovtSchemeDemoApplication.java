package com.bhagyas.practice.service;

import com.bhagyas.practice.model.Person;

import java.util.Scanner;

public class GovtSchemeDemoApplication {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("pls enter first name:");
String firstName = scanner.nextLine();

System.out.println("pls enter lastName");
String lastName = scanner.nextLine();

Person person = new Person();

        Person.firstName = firstName;
        Person.lastName = lastName;

        System.out.println("person details are received"+ person);

        System.out.println("pls enter your address:");

        System.out.println("State:");
        String state = scanner.nextLine();

        System.out.println("city:");
        String city = scanner.nextLine();

        System.out.println("BuildingNmae:");
        String BuildingName = scanner.nextLine();

        System.out.println("District:");
        String district = scanner.nextLine();

        System.out.println("pin:");
        int pin = scanner.nextInt();

        System.out.println("Address details are received");

    }
}
