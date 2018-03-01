package Lab_4;

import java.util.*; 
import java.lang.*;

public class Pentagon {

	public static void main(String[] args) {
		/*
		 * Prompt user for length from center
		 * Compute the side formula
		 * Compute and display the area
		 */
		
		// Prompt user for length from center
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		
		// Compute the side formula
		double s = (2 * r * Math.sin(Math.PI/5));
		
		// Compute and display the area
		double area = (5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI/5)));
		System.out.printf("The area of the pentagon is %.2f", area);
	}

}
