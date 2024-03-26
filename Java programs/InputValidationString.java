package week5;

import java.util.Scanner;

public class InputValidationString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		Boolean valid = false;
		
		do {
			System.out.println("Do you like to code in Java?");
			input = in.nextLine();
			if (input.equalsIgnoreCase("Y")) {
				System.out.println("That's great! I do too!");
				valid = true; // I put this to end the loop if the input is valid
			} else if (input.equalsIgnoreCase("N")) {
				System.out.println("That's ok. There are many other wonderful things in life to learn.");
				valid = true; // I put this to end the loop if the input is valid
			} else {
				System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
				valid = false;
			}
			
		} while (!valid);
		
		in.close(); // end scanner
		
	} // end main

} // end class
