package week6;

import java.util.Scanner;

public class RangeValidated {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will ask the user for three numbers:\r\n"
				+ "    * A starting number\r\n"
				+ "    * An ending number\r\n"
				+ "    * A multiplier\r\n"
				+ "The program will multiply each number between the starting number and ending number by the multiplier.");
		
		int startNum = 0;
		int endNum = 0;
		int multiplier = 0;
		int i = 0;
		
		String input = "";
		String playingAgain = "";
		
		Boolean startValid = false;
		Boolean endValid = false;
		Boolean multiValid = false;
		Boolean playing = false;
		Boolean playingAgainValidation = false;
		
		do {
			do {
				System.out.println("Please enter the starting number:");
				input = in.nextLine();
				
				try {
					startNum = Integer.parseInt(input);
					startValid = true;
					
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
					
				} // ends try/catch
				
			} while (!startValid);
			
				do {
					System.out.println("Please enter the ending number:");
					input = in.nextLine();
					
					try {
						endNum = Integer.parseInt(input);
						endValid = true;
						
					} catch (Exception e) {
						System.out.println("Invalid Response! Please enter a whole number.");
					
					} //ends try/catch
					
				} while (!endValid);
				
					do {
						System.out.println("Please enter the multiplier:");
						input = in.nextLine();
						
						try {
							multiplier = Integer.parseInt(input);
							multiValid = true;
							
						} catch (Exception e) {
							System.out.println("Invalid Response! Please enter a whole number.");
							
						} // ends try/catch
						
					} while (!multiValid);
					
						for (i=startNum; i <= endNum; i++) {
							System.out.println("Multiplying " + i + "by " + multiplier + "results in: " + i*multiplier);
							
						}
							do {
								System.out.println("Would you like to play again? (Y/N): ");
								playingAgain = in.nextLine();
								if (playingAgain.equalsIgnoreCase("Y")) {
									playing = false;
									playingAgainValidation = true;
											
								} else if (playingAgain.equalsIgnoreCase("N")) {
									System.out.println("Thanks for playing.");
									playing = true;
									playingAgainValidation = true;
								} else {
									System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
								}
										
							} while (!playingAgainValidation);
			
		} while (!playing);
		
		in.close();
		
	}

}
