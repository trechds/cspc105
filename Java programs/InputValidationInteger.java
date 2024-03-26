package week5;

import java.util.Scanner;

public class InputValidationInteger {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String input = "";
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Boolean valid = false;
		
		do {
			System.out.println("Please enter a number: ");
			input = in.nextLine();
			try {
				num1 = Integer.parseInt(input);
				valid = true;
				
			} catch (Exception e) {
				System.out.println("Invalid Response! Please enter a whole number.|n");
			} //end try/catch
			
		} while(!valid);
		
		num2 = num1 + 1000;
		num3 = num1 * 2;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

				
		
		in.close(); //end Scanner
		
	} // end main

} // end class
