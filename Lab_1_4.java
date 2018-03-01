/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 1
 */
package Lab_1;

public class Lab_1_4 {

	public static void main(String[] args) {		
		// Read in the rectangle's parameters
		int width = 4;
		int height = 8;
		double area;
		double perimeter;
		
		// Calculate area and perimeter
		area = width * height;
		perimeter = 2 * (width + height);

		// Display Area and perimeter
		System.out.println("The area is: "+ area +"\nThe perimeter is: " + perimeter);
	}

}
