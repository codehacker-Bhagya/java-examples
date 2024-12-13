package com.bhagya.reservation.service;

import com.bhagya.reservation.model.PassengerRegistration;

import java.util.Scanner;

public class PassengerService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option =0;

        PassengerService PassengerRegistrationDemo = new PassengerService();
        PassengerRegistration passenger = new PassengerRegistration();
        do {
            System.out.println("....pls choose your option....");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Login");
            System.out.println("3. information About Flight");
            System.out.println("Welcome to Airline booking System");
            System.out.println("4. book your Ticket here");
            System.out.println("5. instructions");
            System.out.println("6. Billing Details And Ticket Cancellation Details");
            System.out.println("0. Exit ");
            System.out.println("Enter your option");

            option = Integer.parseInt(scanner.nextLine());

           // if (option == 1) {
              //  PassengerRegistration passenger = PassengerRegistrationDemo.createPassenger();
              //  System.out.println("Passenger Registration:" + passenger);
              //  System.out.println("Your Registration Successfull. pls Check your Mo And Emalid for username and passwrd");
          //  }

        }while (option != 0) ;

    }
       public  PassengerRegistration createPassenger(){
        System.out.println("pls enter your full name here");
        String Name = scanner.nextLine();
        System.out.println("pls enter your mo no");
        long MoNo = scanner.nextLong();
        System.out.println("pls enter your UID no");
        long uid = scanner.nextLong();
        System.out.println("Enter your Passport No");
        long passportNo = scanner.nextLong();
        //System.out.println("pls Enter Your Emailid");

        PassengerRegistration passenger = new PassengerRegistration();
        passenger.setFullName(Name);
        passenger.setMoNo(MoNo);
        passenger.setUIDno(uid);
        passenger.setPassportNo(passportNo);
        return passenger;
    }


}
