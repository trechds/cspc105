/*
 * Program: Final Exam 2
 * Name: Thiago Rech
 * Date: 14/12/2022
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		
		System.out.println("In this program, you ask the user to enter a list of numbers. ");
		System.out.println("The program will then find the sum of the numbers and determine which of the numbers is the largest.");
		System.out.println();
		
		// getting user input
		Scanner sIn = new Scanner (System.in);
		
		//creating the list of numbers
		ArrayList <Integer> numbers = new ArrayList <Integer>();

		// calling the methods to print the results
		System.out.println("The sum of the list of numbers is: " + addNumbers(sIn, numbers) + ".");
		System.out.println("The largest number in the list is: " + largestnumber(sIn, numbers) + ".");
				
		// ending the scanner
		sIn.close();
		
	} //end of main()
	
	// method to add the numbers and get the sum
	public static int addNumbers (Scanner sIn, ArrayList<Integer> numbers) {	
		
		do {
			
			System.out.print("Please enter a number (or just hit enter to finish): ");
			String input = sIn.nextLine();
			if (input.equals("")) {
				System.out.println();
				break;
			}
			
			int value = Integer.parseInt(input);
			numbers.add (value);
			
		} while (true);
		
		int sum = 0;
		for(int i = 0; i < numbers.size(); i++) {
		sum += numbers.get(i);
		}
		return sum;
		
	}

	// method to find the largest number in the list
	public static int largestnumber (Scanner sIn, ArrayList<Integer> numbers) {
		
		int largest = 0;
		for (int i = 0; i < numbers.size(); i++) {
			
			// getting the largest with Collections class
			largest = Collections.max(numbers);
		}
		
		return largest;

	}
	
	
}//end of class FinalExam2
