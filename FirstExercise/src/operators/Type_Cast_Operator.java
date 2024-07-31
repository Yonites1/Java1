package operators;

public class Type_Cast_Operator {
	//Q: Type Cast Operator: Create a program that demonstrates narrowing and widening conversions using type cast operators.
	
	public static void main(String[] args) {
    // Widening conversion (implicit)
    int intNumber = 100;
    System.out.println("Integer value: " + intNumber);
    
    long longNumber = intNumber; // int to long (widening)
    System.out.println("Long value (widening): " + longNumber);
    
    float floatNumber = longNumber; // long to float (widening)
    System.out.println("Float value (widening): " + floatNumber);
    
    double doubleNumber = floatNumber; // float to double (widening)
    System.out.println("Double value (widening): " + doubleNumber);
    
    // Narrowing conversion (explicit)
    double largeDoubleNumber = 123.456;
    System.out.println("Double value: " + largeDoubleNumber);
    
    float narrowedFloatNumber = (float) largeDoubleNumber; // double to float (narrowing)
    System.out.println("Float value (narrowing): " + narrowedFloatNumber);
    
    long narrowedLongNumber = (long) narrowedFloatNumber; // float to long (narrowing)
    System.out.println("Long value (narrowing): " + narrowedLongNumber);
    
    int narrowedIntNumber = (int) narrowedLongNumber; // long to int (narrowing)
    System.out.println("Integer value (narrowing): " + narrowedIntNumber);
    
    short narrowedShortNumber = (short) narrowedIntNumber; // int to short (narrowing)
    System.out.println("Short value (narrowing): " + narrowedShortNumber);
    
    byte narrowedByteNumber = (byte) narrowedShortNumber; // short to byte (narrowing)
    System.out.println("Byte value (narrowing): " + narrowedByteNumber);
}

}
