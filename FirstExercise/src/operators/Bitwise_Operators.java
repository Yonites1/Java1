package operators;

//Q: Bitwise Operators: Write a program to find the binary representation of a number and then use bitwise operators to flip all its bits.

import java.util.Scanner;

public class Bitwise_Operators {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Display the binary representation of the number
        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryRepresentation);

        // Flip all bits using the bitwise NOT operator (~)
        int flippedNumber = ~number;

        // Display the binary representation of the flipped number
        String flippedBinaryRepresentation = Integer.toBinaryString(flippedNumber);

        // To match the bit length of the original number, we slice the string to its last bits of the same length
        flippedBinaryRepresentation = flippedBinaryRepresentation.substring(flippedBinaryRepresentation.length() - binaryRepresentation.length());

        System.out.println("Binary representation after flipping all bits: " + flippedBinaryRepresentation);
        System.out.println("Decimal value after flipping all bits: " + flippedNumber);

        // Close the scanner
        scanner.close();
    }

}
