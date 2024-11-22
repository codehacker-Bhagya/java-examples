package com.bhagya.practice.service;

import java.util.Scanner;

public class EventManagementDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Event Management Department");

        System.out.println("pls tell us your Event Name (like Wedding , Birthday ,ETC.");
        String EventName = scanner.nextLine();

        System.out.println("pls Enter Date of your Event");
        int EventDate = scanner.nextInt();

        System.out.println("For How Many Persons are you planning");
        long Guestes = scanner.nextLong();

        System.out.println("Pls tell us your Requiremqnts like decoration , dining Systrem or any other");
        String Requirements = scanner.nextLine();

        System.out.println("can you tell us location or area of you Event");
        String location = scanner.nextLine();

        System.out.println("Thank you Mam/Sir for visiting our site" );
        System.out.println("Our Lawn is available on that date. "  + "And our Lawn Capacity also More Than you required");
        System.out.println("Our lawn located in 5 areas of city and you can select the most suitable one" );

        System.out.println("Our Manager Details are Given Below Pls Contact them For more Details" );
        System.out.println("Manager Name : XYZ" );
        System.out.println("Manager Contact No : 10102201" );
        System.out.println("Thank you" );





    }
}
