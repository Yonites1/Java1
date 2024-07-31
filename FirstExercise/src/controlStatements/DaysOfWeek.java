package controlStatements;

//Q: Days of the Week:
     //• Take a number from 1 to 7 as input.
    //• Display the corresponding day of the week (1 for Monday, 2 for Tuesday, etc.).
    //• Display an error message for numbers outside the range.

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int dayNumber = 2; 

        // Display the corresponding day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error: Invalid number. Please enter a number between 1 and 7.");
                break;
        }

	}

}
