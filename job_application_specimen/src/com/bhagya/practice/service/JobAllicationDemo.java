package com.bhagya.practice.service;
import com.bhagya.practice.model.Applicant;
import com.bhagya.practice.model.Job;
import com.bhagya.practice.model.Qualification;

import java.util.Scanner;
public class JobAllicationDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Applicant First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Applicant Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Gender:" );
        String gender = scanner.nextLine();

        System.out.println("Applicant Date Of Birth:");
        int DOB = scanner.nextInt();

        System.out.println("Applicant Contact No:");
        long contactNo = scanner.nextLong();

        System.out.println("Applicant Email-Id:");
        String emailId = scanner.nextLine();

        System.out.println("Applicant Current living City:");
        String livingCity = scanner.nextLine();

        Applicant applicant = new Applicant();
        Applicant.firstName = firstName;
        Applicant.lastName = lastName;
        Applicant.gender = gender;
        Applicant.DOB = DOB;
        Applicant.contactNo = contactNo;
        Applicant.emailId = emailId;
        Applicant.livingCity = livingCity;

        System.out.println("pls Enter your Qualification Details Here:");
        System.out.println("Higher Qualification:");
        String higherQualification = scanner.nextLine();

        System.out.println("Last Year Percentage:");
        float percentage = scanner.nextFloat();

        System.out.println("Your Passing Year:");
        String passingYear = scanner.nextLine();

        System.out.println("Enter your last year project Name:");
        String projectName = scanner.nextLine();

        Qualification qualification = new Qualification();
        Qualification.higherQualification = higherQualification;
        Qualification.percentage = percentage;
        Qualification.passingyear = passingYear;
        Qualification.projectName = projectName;


        System.out.println("Enter your Current Workplace:");
        String workPlace = scanner.nextLine();

        System.out.println("Enter your Experience if you have :");
        int Experience = scanner.nextInt();

        System.out.println("Salary you Expected:");
        long salary = scanner.nextLong();

        System.out.println("Your job location:");
        String location = scanner.nextLine();


        Job job = new Job();
        Job.WorkPlace = workPlace;
        Job.experience = Experience;
        Job.ExpectedSalary = salary;
        Job.jobLocation = location;






















    }


}
