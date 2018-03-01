package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */

import java.util.Scanner;
public class Lab_2_2 {
// Prints the sum, difference, and product of the variables R and T.
	public static void main(String[] args) {
		
		// Read the values of R and T.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values of R and T: ");
		
		float R, T, sum, diff, prod;
		R = input.nextFloat();
		T = input.nextFloat();

		// Take the sum of the two.
		sum = R + T;
		
		// Take the difference of the two.
		diff = R - T;
		
		// Take the product of the two.
		prod = R * T;
		
		// Print results
		System.out.println("R: " + R);
		System.out.println("T: " + T);
		System.out.printf("The sum of R & T: %.2f\n", sum);
		System.out.printf("The difference of R & T: %.2f\n", diff);
		System.out.printf("The produt of R & T: %.2f\n", prod);

	}

}
