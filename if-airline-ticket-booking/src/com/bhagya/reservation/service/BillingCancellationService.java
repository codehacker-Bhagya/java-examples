package com.bhagya.reservation.service;

import com.bhagya.reservation.model.BillingAndCancellation;

import java.util.Scanner;

public class BillingCancellationService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BillingCancellationService billingCancellationservice = new BillingCancellationService();
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

          //  if(option == 6){
             //   BillingAndCancellation billing = billingCancellationservice.BillingDemo();
               // System.out.println("Your Billing Details Re;" + billing );
              //  System.out.println("If You Wnt delete The Ticket Press Delete");
          //  }

        }while ( option != 0);

    }

    BillingAndCancellation BillingDemo(){
        System.out.println("Pls Select Your Payment Method");
        String method = scanner.nextLine();
        System.out.println("Enter Your UPI ID");
        int upiid = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Your Password");
        int password = Integer.parseInt(scanner.nextLine());

        System.out.println("Payment Successfull" + "Your Ticket Details Will Sent You");

        BillingAndCancellation Billing = new BillingAndCancellation();
        Billing.setPaymentMethod(method);
        Billing.setUpiid(upiid);
        Billing.setPassword(password);
        return Billing;

    }
}
