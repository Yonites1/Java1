package controlStatements;

public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2024; // Example: 2024 is a leap year

        // Check if the year is a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        // Display whether the year is a leap year or not
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	}

}
