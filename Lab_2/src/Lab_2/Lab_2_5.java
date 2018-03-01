package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */

import java.util.Scanner;
public class Lab_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Find values
		System.out.print("Enter the amount of water in kilograms: ");
		double M = input.nextDouble();
		
		System.out.print("Enter the initial temperature in celcius: ");
		double initialTemp = input.nextDouble();
		
		System.out.print("Enter the final temperature in celcius: ");
		double finalTemp = input.nextDouble();

		double Q = M * (finalTemp - initialTemp) * 4184;
		System.out.printf("The energy needed is: %.2f", Q,"joules");
		
	}

}
