package variables;

//Declare a variable for the radius of a circle. Calculate its area and print the result. 
// (Formula: 'm * radius * radius*)

public class AreaofaCircle {

	public static void main(String[] args) {
		
        double radius = 7.5;

        // Calculate the area of the circle (using formula: π(3.14) * radius * radius)
        double area = Math.PI * radius * radius;

        // Print the result
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);

	}

}
