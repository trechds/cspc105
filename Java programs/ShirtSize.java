package week4;

import java.util.Scanner;

public class ShirtSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.");
		System.out.println("Please enter the customer's chest measurement in inches:");
		int chestSize = Integer.parseInt(in.nextLine());
		if (chestSize < 38) {
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size S.");
		}
		else if (chestSize < 40) { //print out customer needs a size M
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size M.");
		}
		else if (chestSize < 43) { // print out customer needs a size L
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size L.");
		}	
		else if (chestSize < 46) { //print out customer needs a size XL
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size XL.");
		}
		else if (chestSize >= 46) { //print out customer needs a size XXL
			System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size XXL.");
		}
						
		in.close();
		
		}
	
}
