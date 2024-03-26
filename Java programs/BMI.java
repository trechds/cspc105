package week4;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
				
		System.out.println("In this program we will calculate a person's BMI.");
		
		System.out.println("Please enter a person's height in inches:");
		double inches = Double.parseDouble(in.nextLine());
		
		
		System.out.println("Please enter a person's weight in pounds:");
		double pounds = Double.parseDouble(in.nextLine());
		
		//Converting inches to m and pounds to kg
		double kg = 0.45359237 * pounds;
		double m = 0.0254 * inches;
		
		//Calculating BMI
		double bmi = kg / (m * m);
		
		String interpretation = ""; //it will be the final classification
		
		if (bmi < 18.5) {
			interpretation = "Underweight";
		}
		else if ((bmi >= 18.5) && (bmi < 24.9)) {
			interpretation = "Normal";
		}
		else if ((bmi >= 25) && (bmi < 29.9)) {
			interpretation = "Overweight";
		}
		else if (bmi >= 30) {
			interpretation = "Obese";
		}
		
		System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: " + interpretation);
		
		in.close();
	}

}
