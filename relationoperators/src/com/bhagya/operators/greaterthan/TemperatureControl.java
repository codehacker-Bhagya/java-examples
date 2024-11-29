package com.bhagya.operators.greaterthan;

import java.util.Scanner;

public class TemperatureControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int MaxTemp = 25;
         int Temp;
         int temp = scanner.nextInt();

         if(temp > MaxTemp){
             System.out.println("Activate Cooling System");
         } else{
             System.out.println(" Temperature is normal ");
         }
    }
}
