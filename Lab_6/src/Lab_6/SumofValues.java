/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 6
 */

/*****************************************************************************************************************
 * This program (called SumofValues) uses a while loop to determine and print out the sum of all values between 1 and 100. 
 ******************************************************************************************************************/
package Lab_6;
public class SumofValues {
	public static void main(String[] args) {
		
		// Initialize max amount of values 
		int count = 1, sum = 0;
		// Add the next number to the pervious number
		while (count < 101) {
			sum += count;			// Add "sum" to the current value of count
			count++;					// Add one to count and go to the next line

		}
	}
}
