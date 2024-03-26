package week7;

import java.util.Scanner;

public class LargestNumber {

	public static int Largestnumber(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}
		else if (b > a && b > c) {
			return b;
		}
		else {
			return c;
		}

	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		String playingAgain = "";
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		boolean valid = true;
		boolean firstValid = false;
		boolean secondValid = false;
		boolean thirdValid = false;
		boolean playAgainValidation = false;
		
		System.out.println("This program will ask the user for three numbers and determine which of the three is the largest.");
		
		do {
			
			do {
				System.out.println("Enter the first number:");
				input = in.nextLine();
				try {
					num1 = Integer.parseInt(input);
					firstValid = true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number");
				}
				
			} while (!firstValid);
			
				do {
					System.out.println("Enter the second number:");
					input = in.nextLine();
					try {
						num2 = Integer.parseInt(input);
						secondValid = true;
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number");
					}
					
				} while (!secondValid);
				
				do {
					System.out.println("Enter the third number:");
					input = in.nextLine();
					try {
						num3 = Integer.parseInt(input);
						thirdValid = true;
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number");
					}
					
				} while (!thirdValid);
				
				
				int result = Largestnumber(num1, num2, num3);
				System.out.println("The largest of the three numbers is: " + result);
				
				do {
					System.out.println("Would you like to play again? (Y/N): ");
					playingAgain = in.nextLine();
					if (playingAgain.equalsIgnoreCase("Y")) {
						valid = false;
						playAgainValidation = true;
						firstValid = false;
						secondValid = false;
						thirdValid = false;
					} else if (playingAgain.equalsIgnoreCase("N")) {
						System.out.println("Thanks for playing.");
						valid = true;
						playAgainValidation = true;
					} else {
						System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
					}
							
				} while (!playAgainValidation);
				
		} while (!valid);
		
		in.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
