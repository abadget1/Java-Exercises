package Lab_1;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 1
 */

public class Lab_1_5 {

	public static void main(String[] args) {
		
		// Assign variables
		
		double speed;
		double average;
		
		// Convert to MPH
		speed = (75.0 / 50) * 60;
		
		// Convert to KPH
		average = (speed * 1.6);
		
		// Display average KPH
		System.out.println("The average speed in in kilometers per hour is: " + average);
	}

}
