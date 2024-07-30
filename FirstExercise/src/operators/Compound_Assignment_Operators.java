package operators;

public class Compound_Assignment_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		int number = 10;

        // Display the original number
        System.out.println("Original number: " + number);

        // Use the += operator
        number += 5; // Equivalent to number = number + 5;
        System.out.println("After += 5: " + number); // Should print 15

        // Use the -= operator
        number -= 3; // Equivalent to number = number - 3;
        System.out.println("After -= 3: " + number); // Should print 12

        // Use the *= operator
        number *= 2; // Equivalent to number = number * 2;
        System.out.println("After *= 2: " + number); // Should print 24

        // Use the /= operator
        number /= 4; // Equivalent to number = number / 4;
        System.out.println("After /= 4: " + number); // Should print 6
    }
	}


