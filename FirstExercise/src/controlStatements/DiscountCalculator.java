package controlStatements;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double totalBill = 320.0; // Example: $650.0

        // Variable to store the final amount after discount
        double finalAmount = totalBill;

        // Apply discount based on the total bill amount
        if (totalBill > 500) {
            finalAmount = totalBill * 0.80; // Apply 20% discount
        } else if (totalBill > 200 && totalBill <= 500) {
            finalAmount = totalBill * 0.90; // Apply 10% discount
        }

        // Display the final amount after discount
        System.out.println("The final amount after discount is: $" + finalAmount);
    

	}

}
