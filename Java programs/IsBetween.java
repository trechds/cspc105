package week7;

import java.util.Scanner;

public class IsBetween {

	public static boolean isBetween(int a, int b, int c) {
		if (b > a && b < c) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		String playAgain = "";
		
		int lowNum = 0;
		int testNum = 0;
		int highNum = 0;
		
		boolean valid = false;
		boolean firstValid = false;
		boolean secondValid = false;
		boolean thirdValid = false;
		boolean playAgainValid = false;
		
		System.out.println("This program will ask the user for three numbers and determine if the second number lies bewteen the first and the third.");
		
		do {
			
			do {
				System.out.println("Enter the low number:");
				input = in.nextLine();
				try {
					lowNum = Integer.parseInt(input);
					firstValid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number");
				}
				
			} while (!firstValid);
			
				do {
					System.out.println("Enter the test number:");
					input = in.nextLine();
					try {
						testNum = Integer.parseInt(input);
						secondValid = true;
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number");
					}
					
				} while (!secondValid);
				
				do {
					System.out.println("Enter the high number:");
					input = in.nextLine();
					try {
						highNum = Integer.parseInt(input);
						thirdValid = true;
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number");
					}
					
				} while (!thirdValid);
				
				
				boolean result = isBetween(lowNum, testNum, highNum);
				if (result = true) {
				System.out.println(testNum + " lies between the numbers " + lowNum + " and " + highNum + ".");
				} else {
					System.out.println(testNum + " DOES NOT lies between the numbers " + lowNum + " and " + highNum + ".");
				}
					
				
				do {
					System.out.println("Would you like to play again? (Y/N): ");
					playAgain = in.nextLine();
					if (playAgain.equalsIgnoreCase("Y")) {
						valid = false;
						playAgainValid = true;
						firstValid = false;
						secondValid = false;
						thirdValid = false;
					} else if (playAgain.equalsIgnoreCase("N")) {
						System.out.println("Thanks for playing.");
						valid = true;
						playAgainValid = true;
					} else {
						System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
					}
							
				} while (!playAgainValid);
				
		} while (!valid);
		
		in.close();
	}
}
