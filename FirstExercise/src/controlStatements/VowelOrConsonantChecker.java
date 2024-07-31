package controlStatements;

//Q: Vowel or Consonant:
	//• Take a single character input.
	//• Check and display if it's a vowel or consonant. Ensure you handle both uppercase and lowercase.

public class VowelOrConsonantChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'E'; 

        // Convert the character to lowercase to make the check case-insensitive
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (lowerCh >= 'a' && lowerCh <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Error: " + ch + " is not a valid alphabet character.");
        }
	}

}
