package week11;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String apostle = "";
		boolean running = false;
		
		System.out.println("This program will show the name of an apostle based on the order they were called, with the Prophet as #1");
		
		do {
			System.out.println();
			System.out.println("Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit):");
			
			apostle = in.nextLine();
			if (apostle.equals("")) {
				running = true;
				System.out.println("Good bye, visit us in 'churchofjesuschrist.org'.");
			} else {
				switch (apostle) {
				
				case "1":
					System.out.println("Number " + apostle + " is: President Russell M. Nelson");
					break;
				case "2":
					System.out.println("Number " + apostle + " is: President Dallin H. Oaks");
					break;
				case "3":
					System.out.println("Number " + apostle + " is: Elder M. Russell Ballard");
					break;
				case "4":
					System.out.println("Number " + apostle + " is: Elder Jeffrey R. Holland");
					break;
				case "5":
					System.out.println("Number " + apostle + " is: President Henry B. Eyring");
					break;
				case "6":
					System.out.println("Number " + apostle + " is: Elder Dieter F. Uchtdorf");
					break;
				case "7":
					System.out.println("Number " + apostle + " is: Elder David A. Bednar");
					break;
				case "8":
					System.out.println("Number " + apostle + " is: Elder Quentin L. Cook");
					break;
				case "9":
					System.out.println("Number " + apostle + " is: Elder D. Todd Christofferson");
					break;
				case "10":
					System.out.println("Number " + apostle + " is: Elder Neil L. Andersen");
					break;
				case "11":
					System.out.println("Number " + apostle + " is: Elder Ronald A. Rasband");
					break;
				case "12":
					System.out.println("Number " + apostle + " is: Elder Gary E. Stevenson");
					break;
				case "13":
					System.out.println("Number " + apostle + " is: Elder Dale G. Renlund");
					break;
				case "14":
					System.out.println("Number " + apostle + " is: Elder Gerrit W. Gong");
					break;
				case "15":
					System.out.println("Number " + apostle + " is: Elder Ulisses Soares");
					break;
					
				default:
					System.out.println("That's not a valid choice. Try again.");
					
				}
			} 
		} while (!running);
		
		in.close();
	}		
}


