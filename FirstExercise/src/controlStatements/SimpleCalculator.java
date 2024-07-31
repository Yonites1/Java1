package controlStatements;

//Q: Simple Calculator:
// • Ask the user to enter two numbers.
// • Ask the user to choose an operation (addition, subtraction, multiplication, division).
// • Perform the operation and display the result.

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 10.0;
        double num2 = 5.0;

        // Predefined operation (you can change this to "+", "-", "*", or "/")
        String operation = "+"; 

        // Result variable
        double result = 0.0;

        // Perform the chosen operation
        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
    }

	}


