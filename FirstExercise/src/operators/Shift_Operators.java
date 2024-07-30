package operators;

//Q: Shift Operators: Accept a number and then left shift and right shift it by two positions. Compare the results.

public class Shift_Operators {
	public static void main(String[] args) {
        // Define a number directly in the code
        int number = 6; 

        // Display the original number and its binary representation
        System.out.println("Original number: " + number);
        System.out.println("Binary representation: " + Integer.toBinaryString(number));

        // Left shift the number by 2 positions
        int leftShifted = number << 2;
        System.out.println("Number after left shifting by 2 positions: " + leftShifted);
        System.out.println("Binary representation after left shift: " + Integer.toBinaryString(leftShifted));

        // Right shift the number by 2 positions
        int rightShifted = number >> 2;
        System.out.println("Number after right shifting by 2 positions: " + rightShifted);
        System.out.println("Binary representation after right shift: " + Integer.toBinaryString(rightShifted));

        // Compare the results
        System.out.println("Comparison of original, left shifted, and right shifted values:");
        System.out.println("Original number: " + number + " (" + Integer.toBinaryString(number) + ")");
        System.out.println("Left shifted: " + leftShifted + " (" + Integer.toBinaryString(leftShifted) + ")");
        System.out.println("Right shifted: " + rightShifted + " (" + Integer.toBinaryString(rightShifted) + ")");
    }

}
