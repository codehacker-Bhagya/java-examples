package com.bhagya.operators.greaterthanequalto;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;

public class PromotionCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        long D = 2024/8/8;

        System.out.println("When You Job Started");
       // int Start = scanner.nextInt();
        System.out.println("Enter Year");
        int Y = scanner.nextInt();

        System.out.println("Enter Month");
        int m = scanner.nextInt();

        System.out.println("Enter Date");
        int d = scanner.nextInt();

        System.out.println("Enter Hour");
        int h = scanner.nextInt();

        System.out.println("Enter Minute");
        int M = scanner.nextInt();

        System.out.println("Enter Second");
        int S = scanner.nextInt();


        LocalDate joiningDate = LocalDate.of(Y,m,d);
        System.out.println("joining Date is:" + joiningDate);

      //  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

       // String formattedDate = joiningDate.format(dateTimeFormatter);

      //  System.out.println("\nAfter format: \n" + formattedDate );



       // System.out.println("add year" );
       // int addYear = scanner.nextInt();

       // Date currentDate = new Date();
      //  System.out.println(currentDate);

      //  System.out.println("Current Date is:" + currentDate);


        Period difference = Period.between(joiningDate, LocalDate.ofEpochDay(D));

        System.out.println("Your Experience is:" +  difference );

       // System.out.println("Difference" + years_difference);



       // int Experience = currentDate - joiningDate;

       // if(  >= 5) {
           // System.out.println("");
     //   }




    }



}
