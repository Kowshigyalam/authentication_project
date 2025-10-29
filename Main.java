package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Information Collector ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        String email;
        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine().trim();

            if (isValidEmail(email)) {
                break;
            } else {
                System.out.println("Invalid email format. Please try again.");
            }
        }

        System.out.println("\n--- User Details Collected ---");
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);

        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(emailRegex, email);
    }
}
