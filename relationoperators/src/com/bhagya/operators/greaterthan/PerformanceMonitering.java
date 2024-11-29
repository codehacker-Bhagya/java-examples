package com.bhagya.operators.greaterthan;

import java.util.Scanner;

public class PerformanceMonitering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String signalName;
        float ThresholdVlaue = 80f;
       String Aggregationtype;
       int Checkevery;
       int CPUCurrentusage;

        System.out.println("Set signal");
        System.out.println("signal Name: CPU" + "Aggration Type: Average" + "Check Every: 5 mint" );

        System.out.println("CPU current Usage");
        float CPUusage = scanner.nextFloat();


       if(CPUusage > ThresholdVlaue){
           System.out.println("CPU usage is above threshold limit please restart your PC");
       }else{
           System.out.println("Sysytem is ok");
       }

    }


}
