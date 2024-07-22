package FirstExercise;

import java.util.Scanner;

public class GreetingAndNameLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
      
        System.out.println("Hello, " + name + "!");
        
       
        int nameLength = name.length();
        System.out.println("Your name has " + nameLength + " characters.");
        
        scanner.close();
    }
}