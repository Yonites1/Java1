package controlStatements;

//Q: Age Group Classification:
	// • Ask the user to enter their age.
 	// • Classify and display the age group (Child: 0-12, Teenager: 13-19, Adult: 20-59, Senior: 60 and above).
public class AgeGroupClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25; // Example: 25 corresponds to Adult

        // Classify and display the age group
        if (age >= 0 && age <= 12) {
            System.out.println("Age " + age + " falls under the category: Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Age " + age + " falls under the category: Teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Age " + age + " falls under the category: Adult.");
        } else if (age >= 60) {
            System.out.println("Age " + age + " falls under the category: Senior.");
        } else {
            System.out.println("Error: Invalid age.");
        }
	}

}
