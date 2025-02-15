package variables;
//Temperature Conversion: Declare a variable for temperature in Celsius. Convert it to Fahrenheit and print both values. (Formula: (celsius * 9/5) + 32)

public class Temp_Conversion {
	public static void main(String[] args) {
        // Declare and initialize temperature in Celsius
        double celsius = 25.0;
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Print both Celsius and Fahrenheit values
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}