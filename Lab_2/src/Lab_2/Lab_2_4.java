package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */

// This program determines the values of coins in a jar and prints out the total dollars and cents.

import java.util.Scanner;
public class Lab_2_4{ 

	public static void main(String[] args) {
		
		// Declare the variables.
		// Prompt user.
		// Display the amount of each coin.
		// Compute the total.
		// Display the total back to the user.
		
		
		// Declare the variables.
		int q,d,n,p;
		
		// Prompt user.
		Scanner input = new Scanner(System.in);
		System.out.print("Amount of Quarters: ");
		q = input.nextInt();

		System.out.print("Amount of Dimes: ");
		d = input.nextInt();
				
		System.out.print("Amount of Nickels: ");
		n = input.nextInt();

		System.out.print("Amount of Pennies: ");
		p = input.nextInt();
		
		// Display the amount of each coin.
		System.out.println("Total Quarters: " + q);
		System.out.println("Total Dimes: " + d);
		System.out.println("Total Nickels: " + n);
		System.out.println("Total Pennies: " + p);


		// Compute the total.
		int totcoins = ((25 * q) + (10 * d) + (5 * n) + p); // Ex. totcoins = 385
		int dollars = totcoins / 100; 					   //    385 / 100 = 3
		int coins = totcoins % 100;                         //    385 % 100 = 85
		
		// Display the total back to the user.
		System.out.println("Total = " + dollars + " dollars " + "and " + coins + " cents.");
		// System.out.println("Total coins: " + totcoins);
	}
}

