/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 5
 */

/*****************************************************************************************************************
 * The great circle distance is the distance between two points on the surface of a sphere. 
 * Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. 
 * The great circle distance between the two points can be computed using the following formula:
 * 
 * 		d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * 
 * 
 * This program prompts the user to enter the latitude and longitude of two points on the earth in 
 * degrees and displays its great circle distance. The average earth radius is 6,371.01 km.
 *****************************************************************************************************************/

package Lab_5;
import java.util.*;
public class GreatCircle {

	public static void main(String[] args) {
		
		// User input w/ comma 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		String p1 = input.nextLine();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		String p2 = input.nextLine();

		// Extract x and y values (and the comma)
		int c1 = p1.indexOf(',');
		double x1 = Double.parseDouble(p1.substring(0, c1));			// Grab the values from 0 to the comma
		double y1 = Double.parseDouble(p1.substring(c1 + 1));			// Grab from the comma too the end

		int c2 = p2.indexOf(',');
		double x2 = Double.parseDouble(p2.substring(0, c2));			// Grab the values from 0 to the comma
		double y2 = Double.parseDouble(p2.substring(c2 + 1));			// Grab the values from 0 to the comma

		/*
		System.out.println("Point 1: (" + x1 + ',' + y1 + ')');
		System.out.println("Point 1: (" + x2 + ',' + y2 + ')');
		*/
		
		// Convert to radians
		double x1rad = Math.toRadians(x1);
		double y1rad = Math.toRadians(y1);
		double x2rad = Math.toRadians(x2);
		double y2rad = Math.toRadians(y2);

		// Compute and display distance
		final double radius = 6371.01; // Average earth radius
		double distance = radius * Math.acos(Math.sin(x1rad) * Math.sin(x2rad) 
				+ Math.cos(x1rad) * Math.cos(x2rad) * Math.cos(y1rad - y2rad));
	
		System.out.println("\nThe distance between the two points is " + distance + " km.");
		input.close();
	}

}
