package com.bhagya.practice.models.service.models;
import java.util.Scanner;
public class BookShopInventoryDemo {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your Book Name:");
            String booktype = scanner.nextLine();

            System.out.println("Books in Store:");
            int books = scanner.nextInt();


        System.out.println("How Many book Purchase?:");
        int purchase = scanner.nextInt();

            System.out.println("Total Books Available in Store:");
            int total = books + purchase;
            System.out.println(total);


            System.out.println("How Many book Sell?:");
        int Sell = scanner.nextInt();

        System.out.println("inventory of booktype " + booktype + " is " );

        int inventory = total - Sell;
        System.out.println(inventory);

}
}