package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores3 {

	public static void main(String[] args) {
		
		try {
			
			File studentScores = new File("Student Assignment Scores.csv");
			Scanner file = new Scanner(studentScores);
			
			System.out.printf ("%-36s %s %n", "Student", "Assignment with 0");
			System.out.println("-------------------------------------------------------");
			
			while (file.hasNextLine()) {
				String[] student = file.nextLine().split(","); 
				for (int i = 1; i < student.length; i++) {
					
					if (student[i].equals("0")) {
						System.out.printf("%-38s %7s %n", student[0], i);
					}
					
				}
			}
			
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}
	
}
