package com.bhagya.operators.lessthan;

import java.util.Scanner;

public class SpeedViolation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int VehicalSpeed;
        int limitSpeed = 80;

        System.out.println("According to RADAR your Vehical Speed is:");
        int Speed = scanner.nextInt();



        if ( limitSpeed < Speed ){
            System.out.println(" Your Vehical Speed is more Tham limit Speed ");
        } else{
            System.out.println(" You Can Go");
        }



    }
}
