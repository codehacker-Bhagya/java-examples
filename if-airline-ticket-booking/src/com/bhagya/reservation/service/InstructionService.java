package com.bhagya.reservation.service;

import com.bhagya.reservation.model.InstructionDetails;

import java.util.Scanner;

public class InstructionService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InstructionService instructionService = new InstructionService();
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

           // if(option == 5){
            // InstructionDetails instructionDetails = instructionService.InstructionsDemo();

               // System.out.println("Instructions : " + instructionDetails);
           // }
        }while( option != 0 );
    }

    InstructionDetails InstructionsDemo(){

        System.out.println("Instructions: 1) ");
        String instructions = scanner.nextLine();
        System.out.println("Terms And Conditions" + " I read Carefully All Instructions ");
        String TermsAndCondition = scanner.nextLine();
        System.out.println("Please Select the box [ ]" + "Agree And Continue" );
        String AgreeAndContinue = scanner.nextLine();

        InstructionDetails instructiondetails = new InstructionDetails();
        instructiondetails.setInstruction(instructions);
        instructiondetails.setTermsAndCondition(TermsAndCondition);
        instructiondetails.setAgreeAndContinue(AgreeAndContinue);

        return instructiondetails;


    }
}
