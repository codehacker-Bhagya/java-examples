package com.bhagya.operators.greaterthan;

import java.util.Scanner;

public class AttendenceCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MinNoOfPeople = 100;
        int TotalNoOfPeople ;
        System.out.println("How Many Participants are present for the Event");

        int  TotalNo = scanner.nextInt();

        if ( TotalNo > MinNoOfPeople){
            System.out.println("Participants in this Event exceed Required no");
        }
        else {
            System.out.println("Participants are less than required");
        }





    }
}
