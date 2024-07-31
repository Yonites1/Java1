package variables;
//Declare two integer variables and initialize them. Write code to swap their values without using a third variable.

public class Swapping_Variables {

	public static void main(String[] args) {
		// Declare and initialize integer variables
        int a = 10;
        int b = 20;
        
        /* Same scenario but swap to Char & String
        char ch1= 'a';
        char ch2= 'b';
        char ch3=ch1;
        	 ch1=ch2;
        	 ch2=ch3; 
        	 System.out.println("ch1 =" + ch1);
        	 System.out.println("ch2 =" + ch2);
        --------------------------------------------
        String s1= "Zeferu";
        String s2= "Yo";
        String s3= s1;
        	s1=s2;
        	s2=s3;
        	 ch2=ch3; 
        	 System.out.println("s1 =" + s1);
        	 System.out.println("s2 =" + s2);	
        	 */
        
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
