package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores2 {

	public static void main(String[] args) {
		
		try {
			
			File studentScores = new File("Student Assignment Scores.csv");
			Scanner file = new Scanner(studentScores);
			
			ArrayList <String[]> classRoster = new ArrayList <String[]> ();
			
			while (file.hasNext()) { classRoster.add(file.nextLine().split(",")); }
			
			
			System.out.printf ("%-30s %8s %8s %8s %8s %8s %8s %n", "Student", "Asn 1", "Asn 2", "Asn 3", "Asn 4", "Asn 5", "Asn 6");
			System.out.println("-------------------------------------------------------------------------------------");
			
			for (int i = 1; i < classRoster.size(); i++) {
				String[] student = classRoster.get(i);
				System.out.printf("%-28s %8s %8s %8s %8s %8s %8s %n", student[0], student[1], student[2], student[3], student[4], student[5], student[6]);
			}
			
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}
	
}
