package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The starter code to an application that a user can use for a shopping list.
 * This provides simple operations like add, delete, show, sort, and exit.
 * 
 * @author Jeff Light
 * @author Alex May (modified by)
 *
 */
public class ShoppingList2 {

	/**
	 * main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to
	 * quit by selecting 'Exit' from the menu.
	 * <p>
	 * The method also creates a new, empty shoppingList of type ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform
	 * actions on the shoppingList.
	 * <p>
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5": // Exit the program
				System.out.println();
				System.out.println("Goodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits

		sIn.close();
	}// end of main()

	//////////////////////////////////////////////
	// STUDENTS, FILL IN THE METHOD STUBS BELOW://
	// addItems() //
	// deleteItems() //
	// showItems() //
	// sortItems() //
	//////////////////////////////////////////////

	/**
	 * Asks the user to enter an item to be stored in the shoppingList and then adds
	 * the item to the shoppingList ArrayList. The user may enter as many items as
	 * they want, hitting ENTER to stop entering items and return to main(). Each
	 * time the user enters an item into the list, a message will be displayed
	 * showing the item entered in the following format:
	 * <p>
	 * 'item' has been added to the Shopping List.
	 * <p>
	 * Example -- 'Eggs' has been added to the Shopping List.
	 * <p>
	 * Returns the number of items added to the shoppingList
	 * 
	 * @param sIn          - The scanner to allow to get user input from the console
	 * @param shoppingList - The array list to store the items of the shopping list
	 * @return - the number of items added to the shopping list
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		boolean valid = false;
		do {
			System.out.println("Add an item to the list (or just hit 'ENTER' when done): ");
			String input = sIn.nextLine();
			if (input.equals("")) {
				break;
			} 
			
			if (input.contains(":")) {
				int separator = input.indexOf(":");
				String item = input.substring(0, separator).trim();
				int amount = 0;
				try {
					String qty = input.substring(separator + 1).trim();
					amount = Integer.parseInt(qty);
					shoppingList.add(item + ":" + amount);
					valid = true;
					System.out.println("'" + item + ":" + amount + "'" + " has been added to the Shopping List.");
				} catch (Exception e) {
					valid = false;
				}	
			}

			if (!valid) {
				System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
			}
			
		} while (true);
				
		return shoppingList.size();
		
	}// end of method addItems(ArrayList<String>)

	/**
	 * Asks the user to enter an item to be deleted from the shoppingList and then
	 * deletes the item from the shoppingList ArrayList. The user may delete as many
	 * items as they want, hitting ENTER to stop deleting items and return to
	 * main(). Each time the user deletes an item from the list, a message will be
	 * displayed showing the item deleted in the following format:
	 * <p>
	 * 'item' has been deleted from the Shopping List.
	 * <p>
	 * Example -- 'Peaches' has been deleted from the Shopping List.
	 * <p>
	 * If the user tries to delete an item not in the list, a message will be
	 * displayed indicating the error and showItems() will be called. Returns the
	 * number of items deleted from the shoppingList
	 * 
	 * @param sIn          - The scanner to allow to get user input from the console
	 * @param shoppingList - The array list to store the items of the shopping list
	 * @return - the number of items deleted from the shopping list
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		String input = "";
		boolean inputValidation = false;
		do {
			System.out.println("The Shopping List contains the following items: \n" + shoppingList);
			System.out.println("Delete an item from the list (or just hit 'ENTER' when done): ");
			input = sIn.nextLine();
			if (input.equals("")) {
				break;
			}
			boolean checkArray = shoppingList.contains(input);
			if (checkArray == true) {
			System.out.println("'" + input + "'" + " has been deleted from the Shopping List.");
			shoppingList.remove(input);
			} else {
				System.out.println("Invalid Response! " + "'" + input + "'" + " is NOT an item in the list.");	
			}
				
		} while (!inputValidation);
		
		return shoppingList.size();
		
	}// end of method deleteItems(ArrayList<String>)

	/**
	 * Simply displays the contents of the shoppingList ArrayList in it's simplest
	 * form. <br>
	 * Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */
	public static void showItems(ArrayList<String> shoppingList) {
		// FIXME: implement the method
		System.out.println();
		System.out.println("---------------------------");
		System.out.printf("%20s %n", "Shopping List");
		System.out.println("---------------------------");
		
	//	System.out.printf("%-14s %12s %n", "Items", "Amount");
		
		
		for (int i = 0; i < shoppingList.size(); i++) {
			if (i > shoppingList.size()) {
				break;
			}
			String input = shoppingList.get(i);
			if (input.contains(":")) {
				int separator = input.indexOf(":");
				String item = input.substring(0, separator).trim();
				int amount = 0;
				try {
					String qty = input.substring(separator + 1).trim();
					amount = Integer.parseInt(qty);
					System.out.printf("%-14s %12s %n", item, amount);
				} catch (Exception e) {
					
				}
				
			}
		}
		
		System.out.println("---------------------------");
			
	}// end of method showItems(ArrayList<String>)

	/**
	 * Sorts the items in the shoppingList ArrayList, then calls showItems() to
	 * display the sorted list. Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		Collections.sort(shoppingList);
		for (int i = 0; i < shoppingList.size(); i++) {
		    System.out.println(shoppingList.get(i)); 
		}
		System.out.println("The Shopping List contains the following items: \n" + shoppingList);
		
	}// end of method sortItems(ArrayList<String>)

}// 
