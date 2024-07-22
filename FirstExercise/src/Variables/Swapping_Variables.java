package Variables;
//Declare two integer variables and initialize them. Write code to swap their values without using a third variable.

public class Swapping_Variables {

	public static void main(String[] args) {
		// Declare and initialize integer variables
        int a = 10;
        int b = 20;
        
        // Print initial values
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap the values without using a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)
        
        // Print swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
