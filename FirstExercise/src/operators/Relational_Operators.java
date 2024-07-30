package operators;

//Q: Relational Operators: Write a program that reads two numbers and checks if they are equal, and if not, which one is greater.

import java.util.Scanner;

public class Relational_Operators {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Check if the numbers are equal
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            // If not equal, determine which one is greater
            if (num1 > num2) {
                System.out.println("The first number (" + num1 + ") is greater than the second number (" + num2 + ").");
            } else {
                System.out.println("The second number (" + num2 + ") is greater than the first number (" + num1 + ").");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
