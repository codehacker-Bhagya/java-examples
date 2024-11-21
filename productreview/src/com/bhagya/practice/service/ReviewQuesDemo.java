package com.bhagya.practice.service;
import com.bhagya.practice.model.Product;

import java.util.Scanner;
public class ReviewQuesDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("THANK YOU FOR USING OUR PRODUCT " +  "WE WILL PUSH A QUESTIONAIRE TO YOU " + "PLEASE GIVE US YOUR FEEDBACK");

      System.out.println("How satisfied are you with the overall quality of our product? scale 1-10");
      int Qualityreview = scanner.nextInt();

      System.out.println(" Does our product meet your needs or expectations? (Scale: Not 1-10)");
      int Deliverytime = scanner.nextInt();

      System.out.println("Have you experienced any performance issues with our product?( yes no)");
      String issueReview = scanner.nextLine();

      System.out.println("packing satisfaction? (Scale: 1-10)");
      int Packagingreview = scanner.nextInt();

      System.out.println("On a scale of 1 to 10, how satisfied are you with our customer service?");
      int SatisfactionScore = scanner.nextInt();

      Product questions = new Product();
        Product.Qualityreview = Qualityreview;
        Product.Deliverytime = Deliverytime;
        Product.issueReview = issueReview;
        Product.Packagingreview = Packagingreview;
        Product.SatisfactionScore = SatisfactionScore;






    }
}
