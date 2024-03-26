package week6;

import java.util.Scanner;

public class ImprovedInterest {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int monthSave = 0;
		int i = 0;
		double monthlyDeposit = 0;
		double annualInterest = 0;
		double balance = 0;
		
		String input = "";
		String stInput = "";
		
		Boolean running = true;
		Boolean validDeposit = false;
		Boolean validInterest = false;
		Boolean validSave = false;
		Boolean playAgain = false;
		
		do { // 1
			System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.\r\n"
					+ "It will then show the monthly balance over the period of planned savings.");
			
			do { // 2
				System.out.println("Please enter the amount to be deposited each month:");
				input = in.nextLine();
				try {
					monthlyDeposit = Double.parseDouble(input);
					validDeposit = true;
				} catch (Exception e) {
					System.out.println("Invalid response! Please enter a number.");
				}
			} while (!validDeposit); // 2
			do { // 3
				System.out.println("Please enter the annual interest rate:");
				input = in.nextLine();
				try {
					annualInterest = Double.parseDouble(input);
					validInterest = true;
				} catch (Exception e) {
					System.out.println("Invalid response! Please enter a number.");
				}
			} while (!validInterest); // 3
			do { // 4
				System.out.println("Please enter the number of months you plan to save:");
				input = in.nextLine();
				try {
					monthSave = Integer.parseInt(input);
					validSave = true;
				} catch (Exception e) {
					System.out.println("Invalid response! Please enter a number.");
				}
			} while (!validSave); // 4
			
			double monthlyInterest = annualInterest/100/12;
			System.out.println("The following table shows the balance of the account for each month of the designated savings period.");
			System.out.printf("%-10s %12s %n", "Month", "Balance");
			for (i = 1; i <= monthSave; i++) {
				balance = (monthlyDeposit + balance)*(1 + monthlyInterest);
				System.out.printf("Month %-10s $%,.2f %n", i , balance);
			} // for loop
			
			do { // 5
				System.out.println("Would you like to make another calculation? (Y/N):");
				stInput = in.nextLine();
				if (stInput.equalsIgnoreCase("Y")) {
					playAgain = true;
					running = false;
				} else if (stInput.equalsIgnoreCase("N")) {
					System.out.println("Thank you for trusting in our bank.");
					playAgain = true;
					running = true;
				} else {
					System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
				}
			} while (!playAgain); // 5
			
		} while (!running); // 1
		
		in.close(); //ends Scanner
		
	}

}

