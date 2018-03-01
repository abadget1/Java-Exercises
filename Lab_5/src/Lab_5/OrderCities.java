
/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 5
 */
/******************************************************************************************************************
 * Write a program that prompts the user to enter three cities and displays them in alphabetical order. 
 * 
 * Here is a sample run:
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * The three cities in alphabetical order are Atlanta Chicago Los Angeles
 ****************************************************************************************************************/

package Lab_5;
import java.util.*;
public class OrderCities {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		// Prompt user for the three cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();

		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();

		
		// Rank alphabetical order
		String temp;
			// If city 2 is largest it declares it as city 1 
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) {			// If city 2 is greatest
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		
			// If city 3 is largest it declares it as city 1 
		if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)) {			// If city 3 is greatest
			temp = city1;
			city1 = city3;
			city3 = temp;
		}
		
			// Determines city 3 and city 2 based on previous lines
		if (city3.compareTo(city2) < 0) {											// If city 3 is greater than remaining city 2
			temp = city2;
			city2 = city3;
			city3 = temp;
		}																			// If all arguments are false it returns the 
																					// original entered order

		
		// Display cities in ascending order
		System.out.println("The three cities in alphabetical order are " +
			city1 + " " + city2 + " " + city3);

		input.close();
	}

}
