package Lab_3;

import java.util.*;
public class Lab_3_3 {

	public static void main(String[] args) {
		
		/*
		 * Prompt for x and y coordinates
		 * Determine location (Origin, axis, or quadrant)
		 * Print coordinate location
		 */
		
		/* Prompt for x and y coordinates */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a coordinate: ");
		double x, y;
		x = input.nextDouble();
		y = input.nextDouble();
		
		// Display the point in proper notation
		System.out.print("(" + x + ", " + y + ")");
		
		/* Determine location (Origin, axis, or quadrant) */
		
		// Origin
		if ((x == 0) && y == 0) {
            System.out.println ( " is at the origin.");}
		
		
		// Quadrants		
		if (x != 0) {
			if (y != 0)
				if (x < 0 && y < 0) {
		            System.out.print(" is in Quadrant III.");}
				
				else if (x < 0 && y > 0) {
		            System.out.print(" is in Quadrant II.");}
				
				else if (x > 0 && y > 0) {
		            System.out.print(" is in Quadrant I.");}
				
				else if (x > 0 && y < 0) {
		            System.out.print(" is in Quadrant IV.");}
		}
				
		// Axis
		if (x == 0 && y != 0) {
			System.out.print(" is on the y-axis.");}
		
		if (y == 0 && x != 0) {
			System.out.print(" is on the x-axis.");}
		
		input.close();
	}
}
