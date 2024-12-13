package com.bhagya.reservation.service;

import com.bhagya.reservation.model.FlightInformation;

import java.util.Scanner;

public class FlightinfoService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FlightinfoService flightinfoService = new FlightinfoService();
        int option = 0;

        System.out.println("Welcome to Airline booking System");
        do{
            System.out.println("....pls choose your option....");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Login");
            System.out.println("3. information About Flight");
            System.out.println("4. book your Ticket here");
            System.out.println("5. instructions");
            System.out.println("6. billing details and Ticket Cancellation Details");
            System.out.println("0. Exit ");

            System.out.println("...Enter your option..");
            option = Integer.parseInt(scanner.nextLine());

           // if(option == 3){
               // FlightInformation information = flightinfoService.FlightServicedemo();
               // System.out.println("Your Flight Information: " + information);
              //  System.out.println("Pls Book Your Ticket Now");

           // }


        }while ( option != 0);

    }

    FlightInformation FlightServicedemo(){

        System.out.println("Enter Your Destination");
        String destination = scanner.nextLine();
        System.out.println("Enter Your Flight Name which flight ticket do you need");
        String flightName = scanner.nextLine();
        System.out.println("Your Flight No Is : 5231" );
        System.out.println("Flight Status: Ticket Is Available You Can book Your Ticket");

        FlightInformation information = new FlightInformation();

        information.setDestination(destination);
        information.setFlightName(flightName);

        return information;

    }
}
