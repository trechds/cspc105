/**
* @author Jeffrey Light
*/
package week11;

import java.util.ArrayList;	// Needed to use ArrayLists
import java.util.Scanner;   // Needed for user input


public class Debugger {

	/**
	 * Main method to launch a Math Games application.
	 * The application will allow users to select from a menu of choices such as Find the Sum, Find the Average and Find the Biggest.
	 * Presents a menu to the user and calls the playMath() method with the associated argument.
	 * 
	 * @param	args	Command line input.  Not intended for use.
	 * @return	void
	 */
	public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in); //Input Scanner for String
        String choice;
        boolean done = false;
        
    	do {
    		//Describe the program functionality
	        System.out.println("This program will give the user the opportunity to try several different math games.");
	    	System.out.println("Select a math game from the menu to play.\n");
	    	
	    	//Present the user with a menu of choices
	    	System.out.println("1: Find the Sum");
	    	System.out.println("2: Find the Average");
	    	System.out.println("3: Find the Biggest");
	    	System.out.println("4: Exit");
	    	System.out.print("Please enter a command: ");
	    	choice = sIn.nextLine();
	    	
	    	//Call the playMath method passing the appropriate argument
	    	switch (choice) {
	    	case "1":
	    		playMath(sIn, "sum");
	    		break;
	    	case "2":
	    		playMath(sIn, "average");
	    		break;
	    	case "3":
	    		playMath(sIn, "biggest");
	    		break;
	    	case "4":
	    		System.out.println("\n\nGoodbye!");
	    		done = true;
	    		break;
	    	default:
	    		System.out.println("\nInvalid response!  Please enter a number between 1-4.\n\n");
	    	}//end of switch (choice)
    	}while (!done); //end of do/while(!done)
	}//end of main() 	
    	
    
	/**
	 * Returns void.
	 * Allows the user to enter in a series of numbers (whole or double) and loads them into an ArrayList<Double> called numList.
	 * Calls the appropriate method to compute the results
	 * Displays the final results to the console.
	 * 
	 * @param	sIn		Scanner object to get input from the user
	 * @param	game	A String indicating the game the user chose to play.  Will = "sum", "average", or "biggest".
	 * @return			void
	 */
	public static void playMath(Scanner sIn, String game) {
		String input = "";										//String variable to hold the user input
		double num = 0;											//Double variable to hold the user input after converted to a number
        double result = 0;										//The value returned from the method called.
        ArrayList<Double> numList = new ArrayList<Double>();	//ArrayList of Doubles to hold the numbers entered by the user
		
		System.out.printf("\nYou will enter a series of numbers (either whole or decimal) and we will find the %s.\n\n",game);
		//Keep adding numbers until the user hits enter without any data.
    	while (true) {
    		System.out.print("Please enter a number (or just hit enter to finish): ");
    		input = sIn.nextLine();
    		if (input.equals("")) {
				break;					//If the user just hits enter, leave the program.
    		}else {
    			try {
    				num = Double.parseDouble(input);	//Input validation.  Try to convert the user's input into a double.
    				numList.add(num);					//If successfully converted, add the user's input to the ArrayList
    			}catch(Exception e) {
    				System.out.println("Invalid response.  Please enter a valid number.\n");
    			}//end of try/catch
    		}//end of if (input.equals(""))
    	}//end of while(true) //Keep adding numbers ...
    	
    	if(game.contentEquals("sum")) {
    		result = sumNumbers(numList);			//Call the sumNumbers() method
    	}else if(game.contentEquals("average")) {
    		result = avgNumbers(numList);			//Call the avgNumbers() method
    	}else {
    		result = biggestNumber(numList);					//Call the biggestNumber() method
    	}//end of if/else if/else (game.contentEquals("sum")
    	
    	//Print out the result
    	System.out.println("-----------------------");
    	System.out.printf("The %s is: %,.2f\n\n",game, result);
	}//end of method playMath(Scanner, String)
    	

	/**
	 * Returns double.
	 * Add us all the numbers in an ArrayList<Double> and returns the total.
	 * Displays each number in the ArrayList and the Running Total.
	 * 
	 * @param	numList	The ArrayList<Double> of numbers entered by the user.
	 * @return	result
	 */
	public static double sumNumbers(ArrayList<Double> numList) {
		double result = 0;													//Initialize the result
		System.out.printf("%-12s%s\n","Number", "Running Total");			//Print the header
		for (int i = 0; i < numList.size(); i++) {						//Process every number in the ArrayList
			result = result + numList.get(i);							
			System.out.printf("%,-15.2f%,.2f\n",numList.get(i), result);	//Print the running total
		}//end of for (int i = 0; i < numList.size(); i++)
		return result;														//Return the result
	}//end of method sumNumbers(ArrayList<Double>)

	
	/**
	 * Returns double.
	 * Add us all the numbers in an ArrayList<Double> and returns the average.
	 * Displays each number in the ArrayList and the Running Average.
	 * 
	 * @param	numList	The ArrayList<Double> of numbers entered by the user.
	 * @return	result
	 */
	public static double avgNumbers(ArrayList<Double> numList) {
		double result = 0;														//Initialize the result
		double sum = 0;															//Initialize the running sum
		System.out.printf("%-12s%s\n","Number", "Running Average");				//Print the header
		for (int i = 0; i < numList.size(); i++) {								//Process every number in the ArrayList
			sum = sum + numList.get(i);
			System.out.printf("%,-15.2f%,.2f\n",numList.get(i), (sum/(i+1)));	//Print the running average
		}//end of for (int i = 0; i < numList.size(); i++)
		result = sum / numList.size();											//Calculate the average
		return result;															//Return the result
	}//end of method avgNumbers(ArrayList<Double>)	
	
	
	/**
	 * Returns double.
	 * Evaluates all the numbers in an ArrayList<Double> and returns the biggest.
	 * Displays each number in the ArrayList and the Running Biggest.
	 * 
	 * @param	numList	The ArrayList<Double> of numbers entered by the user.
	 * @return	result
	 */	
	//Method biggestNumber() which returns the biggest number in an array
	public static double biggestNumber(ArrayList<Double> numList) {
		double result = 0;														//Initialize the result
		System.out.printf("%-12s%s\n","Number", "Running Biggest");				//Print the header
		for (int i = 0; i < numList.size(); i++) {								//Process every number in the ArrayList
			if(numList.get(i) > result) {
				result = numList.get(i);										//If the number processed is bigger than the current biggest, it is the new biggest
			}//end of if(numList.get(i) > result)
			System.out.printf("%,-15.2f%,.2f\n",numList.get(i), result);		//Print the running average
		}//end of for (int i = 0; i < numList.size(); i++)	
		return result;															//Return the result
	}//end of method biggestNumber(ArrayList<Double>)	
	
}//end of class Lab 11a
