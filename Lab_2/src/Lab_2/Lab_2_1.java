package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */

// Takes the average of 3 numbers and prints it on the console.

import java.util.Scanner;
public class Lab_2_1{
	public static void main(String[] args) {
		
		//Find values 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		
		double n1, n2, n3, sum, average;
		n1 = input.nextDouble();
        n2 = input.nextDouble();
		n3 = input.nextDouble();

		//Find the average
		sum = n1 + n2 + n3;
		average = sum / 3;
		
		//Display the entered values and the average
		System.out.println("X: " + n1);
		System.out.println("Y: " + n2);
		System.out.println("Z: " + n3);
		System.out.printf("The average is: %.2f", average);
		
		
	}

}

