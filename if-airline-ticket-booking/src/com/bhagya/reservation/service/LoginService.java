package com.bhagya.reservation.service;


import com.bhagya.reservation.model.LoginPortal;

import java.util.Scanner;

public class LoginService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LoginService LoginPortal = new LoginService();
        int option = 0;

        do{
            System.out.println("....pls choose your option....");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Login");
            System.out.println("3. information About Flight");
            System.out.println("Welcome to Airline booking System");
            System.out.println("4. book your Ticket here");
            System.out.println("5. instructions");
            System.out.println("6. Billing details And Ticket Cancellation Details");
            System.out.println("0. Exit ");

            System.out.println("Enter your option");

            option = Integer.parseInt(scanner.nextLine());

           // if(option == 2){
               // LoginPortal login = LoginPortal.Loggedin();
              //  System.out.println("Login Details:" + login);
              //  System.out.println("You Are Logged In");
            //}


        }while (option != 0);

    }

    LoginPortal Loggedin(){

        System.out.println("Pls Enter Your UserId");
        String username = scanner.nextLine();
        System.out.println("Pls Enter Your Password");
        int password = Integer.parseInt(scanner.nextLine());

        LoginPortal login = new LoginPortal();
        login.setUserName(username);
        login.setPassword(password);

        return login;
    }


}
