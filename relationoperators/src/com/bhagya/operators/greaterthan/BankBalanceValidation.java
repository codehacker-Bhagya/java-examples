package com.bhagya.operators.greaterthan;

import java.util.Scanner;

public class BankBalanceValidation {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        double CurrentBalance = 50000;
        int userid;
        short CCardNo;

        double WithdrawAmmount;
        short Passwrd;

        System.out.println("Enter your uesr id");
        int id = scanner.nextInt();


        System.out.println("pls Enter Your Account No");
        Short CardNo = scanner.nextShort();

        System.out.println("Your Name: XYZ");

        System.out.println("Pls Enter your Amount to withdraw:");
        double Amount = scanner.nextDouble();

        //System.out.println("Enter your Password:");
        //Short paswrd = scanner.nextShort();


        if(Amount > CurrentBalance){
            System.out.println("Entered Amount is More than Current Balance");
        } else{
            System.out.println("Successful Transaction");
        }

        double RemainBal = CurrentBalance -  Amount ;
        System.out.println("Your Current Balance:" + RemainBal);








    }

}
