package week10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScores {

	public static void main(String[] args) {
		
		try {
			
			File studentScores = new File("Student Assignment Scores.csv");
			Scanner file = new Scanner (studentScores);
			
			ArrayList <String[]> classRoster = new ArrayList <String[]> ();
			
			while (file.hasNext()) { classRoster.add(file.nextLine().split(",")); }
			
			System.out.println("------------------------------------------------");
			System.out.printf ("%-21s %8s %8s %8s %n", "Student", "Test 1", "Test 2", "Test 3");
			System.out.println("------------------------------------------------");
			
			for (int i = 1; i < classRoster.size(); i++) {
				String[] student = classRoster.get(i);
				System.out.printf("%-18s %9s %8s %8s %n", student[0],
						gradeCalculator(Integer.parseInt(student[1].trim())),
						gradeCalculator(Integer.parseInt(student[2].trim())),
						gradeCalculator(Integer.parseInt(student[3].trim())));
			}
			
			file.close();
			
		} catch (Exception e) { e.printStackTrace(); }
		
	}

	private static Object gradeCalculator(int percentage) {
		
		if (percentage > 94) { return "A"; }
			
		else if (percentage > 90 && percentage <= 94) { return "A-"; }
			
		else if (percentage > 87 && percentage <= 90) { return "B+"; }
			
		else if (percentage > 84 && percentage <= 87) { return "B"; }
			
		else if (percentage > 80 && percentage <= 84) { return "B-"; }
			
		else if (percentage > 77 && percentage <= 80) { return "C+"; }
			
		else if (percentage > 74 && percentage <= 77) { return "C"; }
			
		else if (percentage > 70 && percentage <= 74) { return "C-"; }
			
		else if (percentage > 67 && percentage <= 70) { return "D+"; }
			
		else if (percentage > 64 && percentage <= 67) { return "D"; }
			
		else if (percentage > 60 && percentage <= 64) { return "D-"; }
			
		else { return "E"; }
		
	}
	
}


