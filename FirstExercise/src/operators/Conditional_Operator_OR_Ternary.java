package operators;

//Q: Conditional Operator (Ternary): Write a program that reads a number and prints "Positive", "Negative", or "Zero" using the ternary operator.

public class Conditional_Operator_OR_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Define a number directly in the code
	        int number = -5; // You can change this value to test other cases

	        // Use the ternary operator to determine if the number is positive, negative, or zero
	        String result = (number > 0) ? "Positive" :
	                        (number < 0) ? "Negative" : "Zero";

	        // Print the result
	        System.out.println("The number is: " + result);
	    }

	}

