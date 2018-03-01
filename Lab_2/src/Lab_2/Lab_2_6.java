package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */
/***********************************************************************
 This program prompts the user to enter three points 
 (x1, y1), (x2, y2), (x3, y3) of a triangle and displays the area.
************************************************************************/
import java.util.*;
public class Lab_2_6 {

	public static void main(String[] args) {
		// Prompt user for coordinates.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		
		double x1,x2, x3, y1,y2, y3;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		// Compute the sides.
		double  s1, s2, s3, s, Area;
		s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		s2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		s = (s1 + s2 + s3) / 2;
		
		// Compute the Area.
		Area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		// Display Area
		System.out.printf("The area of your triangle is: %.1f", Area);
	}

}
