package week4;

import java.util.Scanner;

public class SundaySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.");
		
		System.out.println("Please enter the member's age:");
		int age = Integer.parseInt(in.nextLine());
		
		if (age < 1) {
			System.out.println("The member is a Babe in Arms.");
		}
		
		else if (age >= 1 && age < 3) {
			System.out.println("The member should be in Nursery.");
		}	
		
		else if (age >= 3 && age < 12) {
			System.out.println("The member should attend Primary.");
		}	
		
		else if (age >= 12 && age < 18) {
			System.out.println("Please enter the member's gender:");
			String gender = in.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Young Men's.");
			}	
			
			else if (gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend Young Women's.");
			}
			
			else {
				System.out.println("Please only Type 'M' for Male or 'F' for Female");
			}
		}	
		else if (age >= 18) {
			System.out.println("Please enter the member's gender:");
			String gender = in.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Elder's Quorum");
			}
			else if (gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend Relief Society.");
			}
			else {
				System.out.println("Please only Type 'M' for Male or 'F' for Female");
			}
			
			
			in.close();
		}
		
	}

}
