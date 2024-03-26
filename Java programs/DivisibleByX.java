package week6;

import java.util.Scanner;

public class DivisibleByX {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int startingNum = 0;
		int endingNum = 0;
		int testingNum = 0;
		int i = 0;
		
		String input = "";
		String stInput = "";
		
		Boolean playing = true;
		Boolean again = false;
		Boolean startNum = false;
		Boolean endNum = false;
		Boolean testNum = false;
		
		do { // 1
			System.out.println("In this program, we will display a series of numbers divisible by an integer specified by the user.\r\n"
					+ "You will ask the user for the starting number, the ending number and the integer to be considered.");
			
			do { // 2
				System.out.println("Enter the starting number:");
				input = in.nextLine();
				try {
					startingNum = Integer.parseInt(input);
					startNum = true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			} while (!startNum); // 2
			
			do { // 3
				System.out.println("Enter the ending number:");
				input = in.nextLine();
				try {
					endingNum = Integer.parseInt(input);
					endNum = true;				
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}
			} while (!endNum); // 3
			
			do { // 4
				System.out.println("Enter the test number:");
				input = in.nextLine();
				try {
					testingNum = Integer.parseInt(input);
					testNum = true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
				}	
			} while (!testNum); // 4
			
			System.out.println("Here are the numbers between " + startingNum + " and " + endingNum + " that are divisible by " + testingNum + ":");
			
			for (i = startingNum; i <= endingNum; i++) {
				if (i %testingNum == 0) {
					System.out.println(i);
				}
			} // for loop
			
			do { // 5
				System.out.println("Would you like to play again? (Y/N):");
				stInput = in.nextLine();
				if (stInput.equalsIgnoreCase("Y")) {
					again = true;
					playing = false;
					startNum = true;
					endNum = true;
					testNum = true;
				} else if (stInput.equalsIgnoreCase("N")) {
					again = true;
					playing = true;
					System.out.println("Thank you for playing!");
				} else {
					System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
				}
			} while (!again); // 5
			
		} while (!playing); // 1
		
		in.close();
		
	}

}
