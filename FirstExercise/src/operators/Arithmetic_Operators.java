package operators;

//Q: Arithmetic Operators: Write a program that takes two numbers as input and then displays their sum, difference, product, quotient, and remainder. 

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define two numbers directly in the code
        double num1 = 17.5;
        double num2 = 2.5;

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        // Display the results
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
	}
}
