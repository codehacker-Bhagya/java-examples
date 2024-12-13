package com.bhagya.reservation.service;

import com.bhagya.reservation.model.*;

import static com.bhagya.reservation.service.PassengerService.scanner;

public class AirLineTicketReservationDemo {
    public static void main(String[] args) {
        int option = 0;

        PassengerService PassengerRegistrationDemo = new PassengerService();
        LoginService LoginPortal = new LoginService();
        FlightinfoService flightinfoService = new FlightinfoService();
        TicketBookingService ticketBookingService = new TicketBookingService();
        InstructionService instructionService = new InstructionService();
        BillingCancellationService billingCancellationservice = new BillingCancellationService();
       // PassengerRegistration passenger = new PassengerRegistration();
        do {
            System.out.println("Welcome to Airline booking System");
            System.out.println("....pls choose your option....");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Login");
            System.out.println("3. information About Flight");
            System.out.println("4. book your Ticket here");
            System.out.println("5. instructions");
            System.out.println("6. Billing Details And Ticket Cancellation Details");
            System.out.println("0. Exit ");
            System.out.println("Enter your option");

            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                PassengerRegistration passenger = PassengerRegistrationDemo.createPassenger();
                System.out.println("Passenger Registration:" + passenger);
                System.out.println("Your Registration Successfull. pls Check your Mo And Emalid for username and passwrd");
            }
            if(option == 2){
                LoginPortal login = LoginPortal.Loggedin();
                System.out.println("Login Details:" + login);
                System.out.println("You Are Logged In");
            }
            if(option == 3){
                FlightInformation information = flightinfoService.FlightServicedemo();
                System.out.println("Your Flight Information: " + information);
                System.out.println("Pls Book Your Ticket Now");
            }
            if(option == 4){
                TicketBooking ticketBooking =ticketBookingService.Booking();
                System.out.println("Ticket Booking Details : " + ticketBooking);
            }
            if(option == 5){
                InstructionDetails instructionDetails = instructionService.InstructionsDemo();
                System.out.println("Instructions : " + instructionDetails);
            }
            if(option == 6){
                BillingAndCancellation billing = billingCancellationservice.BillingDemo();
                System.out.println("Your Billing Details Re;" + billing );
                System.out.println("If You Wnt delete The Ticket Press Delete");
            }

        }while (option != 0) ;
        PassengerRegistration passenger = new PassengerRegistration();
        LoginPortal login = LoginPortal.Loggedin();
        FlightInformation information = new FlightInformation();
        TicketBooking ticketBooking = new TicketBooking();
        InstructionDetails instructiondetails = new InstructionDetails();
        BillingAndCancellation Billing = new BillingAndCancellation();


    }
}
