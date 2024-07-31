package controlStatements;

//Q: Even or Odd:
// • Take an integer input.
// • Check if the number is even or odd and display the result.

public class EvenOrOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 42; // Example: 42 is even

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

	}

}
