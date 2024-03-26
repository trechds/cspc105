package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PasswordScanner {

	public static void main(String[] args) {

		// checking if the file exists or not
		File passwords = new File("Pwd.txt");
		if (!passwords.exists()) {
			System.out.println("Error, no file 'Pwd.txt' exists");
			return;
		}

		Scanner fileIn = null;
		
		// here we will write the new files
		PrintWriter invalidPasswords = null;
		PrintWriter validPasswords = null;
		
		try {
			System.out.println("Beginning password analysis....");
			System.out.println("Opening file 'Pwd.txt'");
			fileIn = new Scanner(passwords);
			
			// creating the new files to separate the valid passwords from the invalid passwords
			invalidPasswords = new PrintWriter("invalidpwd.txt");
			validPasswords = new PrintWriter("validpwd.txt");

			// validating the passwords
			while (fileIn.hasNextLine()) {
				String password = fileIn.nextLine();
				
				// here will be add the valid passwords to the new file validpwd.txt
				if (hasLower(password) && hasUpper(password) && hasNumber(password) && hasSpecial(password)) {
					validPasswords.println(password);
				}
				
				// here will be add the invalid passwords to the new file invalidpwd.txt
				else {
					invalidPasswords.println(password);
				}
			}

			fileIn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} finally { // closing all the objects
			System.out.println("Analysis complete. Closing files.");
			if (fileIn != null) {
				fileIn.close();
			}
			if (invalidPasswords != null) {
				invalidPasswords.close();
			}
			if (validPasswords != null) {
				validPasswords.close();
			}
		}
		
		System.out.println("Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the "
				+ passwords.getAbsolutePath() + " directory.");

	}

	// this method will check if the password has at least one Lower Case letter
	private static boolean hasLower(String password) {
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				return true;
			}
		}
			return false;
		}
	
	// this method will check if the password has at least one Upper Case letter
	public static boolean hasUpper(String password) {
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	// this method will check if the password has at least one Number
	public static boolean hasNumber(String password) {
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}

	// this method will check if the password has at least one of the following special characters @, #, %, -, &, *
	public static boolean hasSpecial(String password) {
		HashSet <Character> specials = new HashSet <Character> (Arrays.asList('@', '#', '%', '-', '&', '*'));
		for (char c : password.toCharArray()) {
			if (specials.contains(c)) {
				return true;
			}
		}
		return false;
	}

}
