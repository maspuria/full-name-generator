package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName + " " + lastName;

        if (middleName.length() == 0 && suffix.length() == 0){
            fullName = firstName + " " + lastName;
        } else if (middleName.length() == 0){
            fullName = firstName + " " + lastName + ", " + suffix;
        } else if (suffix.length() == 0){
            fullName = firstName + " " + middleName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }
        System.out.println("Full name: " + fullName);

    }
}
