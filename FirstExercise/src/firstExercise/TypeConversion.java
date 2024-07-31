package firstExercise;

public class TypeConversion {
    public static void main(String[] args) {
        int intNum = 10;          // Integer
        float floatNum = 2.5f;    // Float
        double doubleNum = 3.14159; // Double

        // Implicit Conversion: int to float (implicit = automatic) literal meaning is something clear
        float result1 = intNum + floatNum;
        System.out.println("Result of int + float: " + result1); // Output: 12.5

        // Implicit Conversion: float to double
        double result2 = floatNum + doubleNum;
        System.out.println("Result of float + double: " + result2); // Output: 5.64159

        // Implicit Conversion: int to double
        double result3 = intNum + doubleNum;
        System.out.println("Result of int + double: " + result3); // Output: 13.14159
        
        
     // Explicit Conversion: double to int
        int convertedInt = (int) doubleNum;
        System.out.println("Converted int from double: " + convertedInt); // Output: 3

        // Explicit Conversion: float to int
        int convertedIntFromFloat = (int) floatNum;
        System.out.println("Converted int from float: " + convertedIntFromFloat); // Output: 2

        // Explicit Conversion: int to float
        float convertedFloat = (float) intNum;
        System.out.println("Converted float from int: " + convertedFloat); // Output: 10.0

        // Explicit Conversion: int to double
        double convertedDouble = (double) intNum;
        System.out.println("Converted double from int: " + convertedDouble); // Output: 10.0

        // Explicit Conversion: float to double
        double convertedDoubleFromFloat = (double) floatNum;
        System.out.println("Converted double from float: " + convertedDoubleFromFloat); // Output: 2.
        
        // add byte and char
    }
}