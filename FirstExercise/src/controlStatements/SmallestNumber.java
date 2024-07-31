package controlStatements;

//Q: Smallest among Three Numbers:
	// • Take three numbers as input.
	// • Determine and display the smallest number.

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
        int num2 = 3;
        int num3 = 9;

        // Determine the smallest number
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        // Display the smallest number
        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + smallest);
    
	}

}
