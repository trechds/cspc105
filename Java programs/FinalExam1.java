/*
 * Program: Final Exam 1
 * Name: Thiago Rech
 * Date: 14/12/2022
 * Description: Strings
 */
 package Final;

import java.util.Scanner;

public class FinalExam1 {
	public static void main(String[] args) {
		
		// scanner object to get user input
		Scanner in = new Scanner(System.in);
	
		// main boolean
		boolean running = false;
		
		do {
			
			
			System.out.print("Please enter your name: ");
			String name = in.nextLine();
			System.out.println();
			
			System.out.print("Please enter the name of your Ward: ");
			String ward = in.nextLine();
			System.out.println();
			
			// creating variables to store the data from the user input
			int males = 0;
			int females = 0;
			
			// boolean variables to make input validation
			boolean maleValid = true;
			boolean femaleValid = true;
			
			do {
				System.out.print("Please enter the approximate number of adult males in the ward: ");
				
				// getting user input
				String input = in.nextLine();
				
				
				// input validation
				try {
					males = Integer.parseInt(input);
					maleValid = true;
					running = true;
					
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
					running = false;
					maleValid = false;
				}
				
				System.out.println();
				
				// end of do while loop for male user input validation
			} while (!maleValid);
			
			do {
				System.out.print("Please enter the approximate number of adult females in the ward: ");
				
				// getting user input
				String input = in.nextLine();
				
				// input validation
				try {
					females = Integer.parseInt(input);
					femaleValid = true;
					running = true;
					
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number.");
					running = false;
					femaleValid = false;
				}
				
				System.out.println();
				
				// end of do while loop for female user input validation
			} while (!femaleValid);
						
			System.out.printf("There are " + (males + females) + " adult members in " + name + "'s " + ward + " ward.");
			 
			// end of main do while loop
		} while (!running);
		
		// end of the scanner
		in.close();
		
	}//end of main()
	
	
}//end of class FinalExam1