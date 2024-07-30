package Variables;

import java.util.Scanner;

//User Input: Use the Scanner' class to get an input
//string from the user and store it in a variable. Then, print it out.

public class User_Input {
	public static void main(String[] args) {
		
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter a string: ");
        
        // Read the input string and store it in a variable
        String inputString = scanner.nextLine();
        
        // Print the input string
        System.out.println("You entered: " + inputString);
        
        // Close the scanner
        scanner.close();
    }

}

