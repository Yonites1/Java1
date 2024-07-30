package Variables;

//Declare an integer variable. Assign it a value, print it, 
//reassign a new value, and then print it again.

public class Reassignment {

	public static void main(String[] args) {
		
		// Declare and initialize an integer variable
        int myInt = 25;
       
        /* Example for string 
         String s1 = "Zeferu";
        	s1.concat("ZeleTsegaye"); 
        	
        	System.out.println("s1 = " + s1);*/
        
        // Print the value
        System.out.println("Initial value: " + myInt);
        
        // Reassign a new value to the variable
        myInt = 50;
        // Print the new value
        System.out.println("New value: " + myInt);

	}

}
