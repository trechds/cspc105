package week13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormLetter {

	public static void main(String[] args) {
		Scanner scoreFileIn = null;
		Scanner letter = null;
		
		try {
			scoreFileIn = new Scanner(new File("Student Assignment Scores.csv"));
			letter = new Scanner(new File("Warning Letter to Student -.txt"));
			
			letter.useDelimiter("\\Z");
			String letterBody = letter.next();
			
			while (scoreFileIn.hasNextLine()) {
				String[] scores = scoreFileIn.nextLine().split(",");
				
				boolean hasZero = false;
				for (int i = 1; i < scores.length; i++) {
					if (scores[i].equalsIgnoreCase("0")) {
						hasZero = true;
						break; 
					}
				
				}
				
				if (hasZero) {
					PrintWriter studentLetter = new PrintWriter("Warning Letter to Student - " + scores[0] + ".txt");
					studentLetter.println("Dear " + scores[0] + ",");
					
					studentLetter.println(letterBody);
					studentLetter.println();
					
					for (int i = 1; i < scores.length; i++) {
						if (scores[i].equalsIgnoreCase("0")) {
							studentLetter.println("Assignment " + i);
						}
						
					}
					
					studentLetter.close();
				}
				
			}
			
		} catch (Exception e) {
			
		} finally {
			
			System.out.println("Creating letters for:\r\n"
					+ "\r\n"
					+ "Garrett Wang\r\n"
					+ "Ethan Phillips\r\n"
					+ "Roxann Dawson\r\n"
					+ "Robert Beltran\r\n"
					+ "Robert McNeil\r\n"
					+ "Armin Shimerman\r\n"
					+ "Dominic Keating\r\n"
					+ "John Billings");
			
			if (scoreFileIn != null) {
				scoreFileIn.close();
				
			} if (letter != null) {
				letter.close();
				
			}
			
		}
		
	}
	
}
