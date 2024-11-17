package com.example.client;

import java.util.Scanner;

public class Clavier {

   public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter an integer: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                validInput = true; // Input is valid, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }
}

