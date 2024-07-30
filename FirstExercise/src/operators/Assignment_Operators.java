package operators;

//Q: Assignment Operators: Use assignment operators to halve a number continuously until it is less than 1.

import java.util.Scanner;

public class Assignment_Operators {
	public static void main(String[] args) {
		
		// Define the initial number directly in the code
        double number = 24.2; 
        
        // Display the starting number
        System.out.println("Starting number: " + number);

        // Continuously halve the number using the assignment operator
        while (number >= 1) {
            number /= 2; // Halve the number using the division assignment operator
            System.out.println("Number after halving: " + number);
    }

}
}