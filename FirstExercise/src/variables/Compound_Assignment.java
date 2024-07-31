package variables;

//Declare an integer variable with a value. Use compound assignment operators to increase its value incrementally and print the results.

public class Compound_Assignment {
	public static void main(String[] args) {
		
        
        int num = 15;
        
       
        System.out.println("Initial value: " + num);
        
        
        num += 5; // equivalent to num = num + 5;
        System.out.println("After += 5: " + num);
        
        num -= 2; // equivalent to num = num - 2;
        System.out.println("After -= 2: " + num);
        
        num *= 3; // equivalent to num = num * 3;
        System.out.println("After *= 3: " + num);
        
        num /= 4; // equivalent to num = num / 4;
        System.out.println("After /= 4: " + num);
        
        num %= 3; // equivalent to num = num % 3;
        System.out.println("After %= 3: " + num);
    }
}