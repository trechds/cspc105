package week3;

import java.util.Scanner;

public class Interest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the amount to be deposited each month: ");
		double deposit = Double.parseDouble(in.nextLine());
		
		System.out.println("Please enter the annual interest rate percent: ");
		double interest = Double.parseDouble(in.nextLine());
		
		double monthlyInterest = interest/100/12;
		
	//Calculate 1st month's deposit
		double firstBalance = deposit * (1 + monthlyInterest);
	//Calculate 2nd month's balance
		double secondBalance = (deposit + firstBalance) * (1 + monthlyInterest);
	//Calculate 3rd month's balance
		double thirdBalance = (deposit + secondBalance) * (1 + monthlyInterest);
	//Calculate 4th month's balance
		double fourthBalance = (deposit + thirdBalance) * (1 + monthlyInterest);
	//Calculate 5th month's balance
		double fifthBalance = (deposit + fourthBalance) * (1 + monthlyInterest);
	//Calculate 6th month's balance
		double sixthBalance = (deposit + fifthBalance) * (1 + monthlyInterest);

		System.out.println();
		System.out.println("The ending balance after 6 months is: $ " + sixthBalance);
		
		in.close();
		
	}
	
}
