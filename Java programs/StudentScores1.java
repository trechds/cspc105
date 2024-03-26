package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores1 {

	public static void main(String[] args) {
		
		try {
			
			File studentScores = new File("Student Assignment Scores.csv");
			Scanner file = new Scanner(studentScores);
			
			while (file.hasNext()) { System.out.println(file.nextLine()); }
			
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}
	
}
