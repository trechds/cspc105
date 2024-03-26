
package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("This program will ask the user to enter a series of numbers.\r\n"
				+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
				+ "The program will then display the array of numbers and the sum total of those numbers.");
		
		boolean running = false;
		do {
			boolean inputValidation = false;
			do {
				System.out.println("Please enter a number (or just hit enter to finish):");
				String input = in.nextLine();
				if (input.equals("")) {
					break;
				} try {
					int value = Integer.parseInt(input);
					numbers.add (value);
				} catch (Exception e){
					System.out.println("Invalid response! Please enter a whole number.");
				}
				
			} while (!inputValidation);

			System.out.printf("%-10s %12s %n", "Index", "Item");
			for (int index = 0; index < numbers.size(); index++) {
				System.out.printf("%-10d %12d %n", index, numbers.get(index));
			}
			
			int sum = sumValues(numbers);
			System.out.println("There are " + sum + " items in the ArrayList.");
			int totalNumber = sumValues(numbers);
			System.out.println("The sum total number in the ArrayList is " + totalNumber);
			
			boolean valid = false;
			do {
				System.out.println("Do you wish to play again? (Y/N):");
				String input = in.nextLine();
				if (input.equalsIgnoreCase("y")) {
				valid = true;
				running = false;
				inputValidation = false;
				numbers.clear();
				} else if (input.equalsIgnoreCase("n")) {
					System.out.println("The application has ended.");
					valid = true;
				} else {
					System.out.println("Invalid response. Please enter either a 'Y' or 'N'.");
				}
			} while (!valid);
		} while (!running);
		
		in.close();
	}

	public static int sumValues(ArrayList<Integer> array) {
		int sum = 0;
		sum += array.size();
		return sum;
	}
	
}
