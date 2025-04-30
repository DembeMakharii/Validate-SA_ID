package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("South African ID Validator");
        System.out.println("--------------------------");
        
        while (true) {
            System.out.print("\nEnter ID number (or 'quit' to exit): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            if (ValidateSAid.isValid(input)) {
                System.out.println("\n✅ Valid SA ID Number");
                System.out.println("Gender: " + ValidateSAid.getGender(input));
                System.out.println("Birth Date: " + ValidateSAid.getBirthDate(input));
                System.out.println("\nID Breakdown:");
                System.out.println("YYMMDD: " + input.substring(0, 6));
                System.out.println("Citizenship: " + 
                    (input.charAt(10) == '0' ? "SA Citizen" : "Permanent Resident"));
                
            } else {
                System.out.println("\n❌ Invalid SA ID Number");
                System.out.println("Possible issues:");
                System.out.println("- Incorrect length (must be 13 digits)");
                System.out.println("- Invalid date format");
                System.out.println("- Invalid citizenship digit");
            }
        }
        
        scanner.close();
        System.out.println("\nGoodbye have a great day !");
    }
}