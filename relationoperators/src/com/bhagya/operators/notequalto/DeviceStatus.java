package com.bhagya.operators.notequalto;

import java.util.Scanner;

public class DeviceStatus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String MobileData = "yes";

        System.out.println("Do you want your mobile data turned on");
        String data = scanner.nextLine();

        if("String MobileData " != "data"){
            System.out.println("Pls turn on your mobile data");
        }else{
            System.out.println("turned on");
        }

    }
}
