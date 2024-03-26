package week3;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
			//The width of a square
			System.out.println("Please enter the width of the square: ");
			String sq1 = in.nextLine(); //String Input
			int sqWidth = Integer.parseInt(sq1); //Converting
			
			//The width of a rectangle
			System.out.println("Please enter width of the rectangle: ");
			String rc1 = in.nextLine(); //String Input
			int recWidth = Integer.parseInt(rc1); //Converting
			
			//The height of a rectangle
			System.out.println("Please enter height of the rectangle: ");
			String rc2 = in.nextLine(); //String Input
			int recHeight = Integer.parseInt(rc2); //Converting
			
			int sqArea = sqWidth * sqWidth; //Calculating the Square area
			int recArea = recWidth * recHeight; //Calculating the Rectangle area
			
			System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea + ".");
			System.out.println("The area of a rectangle with a width of " + recWidth +  " and a height of " + recHeight + " is " + recArea + ".");
					
			in.close();
			
		}
	}
