package week5;

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Boolean playing = true;
		Boolean correct = false;
		Boolean valid = false;
		Boolean inputValid = false;
		
		String input = "";
		String stInput = "";
		
		int num1 = 0;
		int guessCount = 0;
		
		// outermost loop - does the user want to keep playing the game?
		do { //PRIMARY PROGRAM DO-WHILE LOOP
			// Define the range
			int max = 100;
			int min = 1;
			int range = max - min + 1;
			
			// Generate a random number between min and max
			int randNum = (int)(Math.random() * range) + min;
			
			System.out.println("This program is a guessing game.");
			System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
			System.out.println("Let's get started!");
			
			// loop to determine if the guess is correct
			do { //GAME DO-WHILE LOOP
				
				// loop to make sure the user is entering valid numbers - determine the user's guess
				do { // NUMERIC INPUT VALIDATION DO-WHILE LOOP
					System.out.println("What is your guess?");
					input = in.nextLine();
					try {
						num1 = Integer.parseInt(input);
						valid = true;		
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number.");	
						
					} //ends try/catch
					
				} while(!valid); //end loop to make sure the user is entering valid numbers
				
				guessCount++;
				if (randNum > num1) {
					System.out.println("Your guess is too low. Try again.");
				} else if (randNum < num1) {
					System.out.println("Your guess is too high. Try again");
				} else {
					System.out.println("CORRECT! You guessed it in " + guessCount + " tries!");
					correct = true;
				}
					
			}while (!correct); //end of loop to determine if the guess is correct
			
			
			// loop to determine if user wants to play again and if the input is valid
			do { // NON-NUMERIC INPUT VALIDATION DO-WHILE LOOP
				System.out.println("Would you like to play again? (Y/N)");
				stInput = in.nextLine();
				if (stInput.equalsIgnoreCase("Y")) {
					inputValid = true;
					playing = true;
				} else if (stInput.equalsIgnoreCase("N")) {
					System.out.println("See you later ;)");
					inputValid = true;
					playing = false;
				} else {
					System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
				}
				
			} while (!inputValid);// end of loop to determine if user wants to play the game again
			
		}while(playing); //end of my outermost loop
		
		
		
		
		in.close(); //ends the Scanner
		
	}
}
