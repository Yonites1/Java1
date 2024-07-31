package controlStatements;

//Q: Grade Calculator:
     //• Take a percentage score as input.
     //• Convert the score into a letter grade (A for 90-100%, B for 80-89%, and so on).

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double percentageScore = 77.0; 

        
        char grade;

        
        if (percentageScore >= 90 && percentageScore <= 100) {
            grade = 'A';
        } else if (percentageScore >= 80 && percentageScore < 90) {
            grade = 'B';
        } else if (percentageScore >= 70 && percentageScore < 80) {
            grade = 'C';
        } else if (percentageScore >= 60 && percentageScore < 70) {
            grade = 'D';
        } else if (percentageScore >= 0 && percentageScore < 60) {
            grade = 'F';
        } else {
            System.out.println("Error: Invalid percentage score.");
            return;
        }

        
        System.out.println("The letter grade for a percentage score of " + percentageScore + " is: " + grade);

	}

}
