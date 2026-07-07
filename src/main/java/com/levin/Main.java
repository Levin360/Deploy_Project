package com.levin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to view classroom info?" + "\nPress 1 if 'Yes' and 2 of 'No");
        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("Enter Section Name: ");
            String sectionName = scanner.next();
            System.out.println("Section name: " + sectionName);

            System.out.println("Enter number of Student: ");
            int numberOfStudents = scanner.nextInt();
            System.out.println("Number of Student: " + numberOfStudents);

            System.out.println("Enter Advisor's Name: ");
            String nameOfAdvisor = scanner.next();
            System.out.println("Advisor's name: " + nameOfAdvisor);

            for(int x = 0; x < numberOfStudents; x++){
                Student student = new Student();

                System.out.println("Enter Student's Id: ");
                int studentId = scanner.nextInt();
                System.out.println("Student's Id: " + studentId);

                System.out.println("Enter Student's Name: ");
                String studentName = scanner.next();
                System.out.println("Student's Name: " + studentName);

                System.out.println("Enter Student's Age: ");
                int studentAge = scanner.nextInt();
                System.out.println("Student's Age: " + studentAge);
            }



        }

    }
}