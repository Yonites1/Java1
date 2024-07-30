package operators;

//Q: Logical Operators: Create a program that checks if a number is both divisible by 2 and 3 using logical operators.

import java.util.Scanner;

public class Logical_Operators {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 2 and 3 using logical AND operator
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("The number " + number + " is divisible by both 2 and 3.");
        } else {
            System.out.println("The number " + number + " is not divisible by both 2 and 3.");
        }

        // Close the scanner
        scanner.close();
    }

}
