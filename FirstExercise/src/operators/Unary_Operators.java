package operators;

//Q: Unary Operators: Create a program that demonstrates the use of increment (both pre and post) and decrement operators (both pre and post).

public class Unary_Operators {
	public static void main(String[] args) {
        // Initialize a variable
        int num = 10;

        // Demonstrate post-increment
        System.out.println("Initial value of num: " + num);
        System.out.println("Post-increment (num++): " + (num++));
        System.out.println("Value of num after post-increment: " + num);

        // Demonstrate pre-increment
        System.out.println("Pre-increment (++num): " + (++num));
        System.out.println("Value of num after pre-increment: " + num);

        // Reset the value of num
        num = 10;

        // Demonstrate post-decrement
        System.out.println("Reset value of num: " + num);
        System.out.println("Post-decrement (num--): " + (num--));
        System.out.println("Value of num after post-decrement: " + num);

        // Demonstrate pre-decrement
        System.out.println("Pre-decrement (--num): " + (--num));
        System.out.println("Value of num after pre-decrement: " + num);
    }

};
