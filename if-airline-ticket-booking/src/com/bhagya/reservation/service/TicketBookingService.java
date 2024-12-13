package com.bhagya.reservation.service;

import com.bhagya.reservation.model.TicketBooking;

import java.util.Scanner;

public class TicketBookingService {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicketBookingService ticketBookingService = new TicketBookingService();
        int option = 0;

        do{
            System.out.println("....pls choose your option....");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Login");
            System.out.println("3. information About Flight");
            System.out.println("4. book your Ticket here");
            System.out.println("5. instructions");
            System.out.println("6. Billing Details And Ticket Cancellation Details");
            System.out.println("0. Exit ");

            System.out.println("Pls Enter Your option");
            option = Integer.parseInt(scanner.nextLine());

            if(option == 4){
                TicketBooking ticketBooking =ticketBookingService.Booking();
                System.out.println("Ticket Booking Details : " + ticketBooking);

            }
        }while (option != 0);


    }
    TicketBooking Booking(){
        System.out.println("Enter Your Destination");
        String destination = scanner.nextLine();
        System.out.println("Enter Seat Preference");
        String seatpreference = scanner.nextLine();
        System.out.println("Enter Passport No");
        int passportNo = Integer.parseInt(scanner.nextLine());
        System.out.println("Do you want add meal");
        String meal = scanner.nextLine();
        System.out.println("Your Total Amount of Ticket is:");
        System.out.println("Your Ticket Ammount Is : 5000Rs." + "CGST = 400rs" + "Meal Charge = 1000rs" + "Total amount is:6400rs");

        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.setSeatPreference(seatpreference);
        ticketBooking.setDestination(destination);
        ticketBooking.setPassportNo(passportNo);
        ticketBooking.setAddMeal(meal);

        return ticketBooking;

    }
}
