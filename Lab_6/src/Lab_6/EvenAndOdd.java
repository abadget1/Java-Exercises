
/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 6
 */

/*****************************************************************************************************************
 * This program (called EvenAndOdd) uses a while loop to determine and print out all even numbers 
 * between 50 and 100 on a single line, separated by commas. Then another while loop in the same program to print 
 * out all odd numbers between 50 and 100 on a new line, separated by commas. 
 * Use proper label for the outputs as shown in the example below.
 * 
 * 		Even numbers between 50 and 100: 50, 52, 54, 56, 58, 60, 62, 64, …
 * 
 * 		Odd numbers between 50 and 100: 51, 53, 55, 57, 59, 61, 63, 65, … 
 ******************************************************************************************************************/
package Lab_6;
public class EvenAndOdd {

	public static void main(String[] args) {
		
		// Initialize the starting value
		int num = 50; 
		System.out.print("\nEven numbers between 50 and 100: ");				// Print the even "output"

		while (num < 100) {
			if (num % 2 == 0) {												// Determine if even
				System.out.print(num + ", ");
				}
			num ++;
			if (num == 100) {
				System.out.print(num);										// End value without comma
				}
			}
		
		
		int sum = 50;
		System.out.print("\n\nOdd numbers between 50 and 100: ");				// Print odd results
		while (sum < 100) {
			if (sum % 2 != 0) {												// Determine if odd
				System.out.print(sum + ", ");
				}
			sum++;
			if (sum == 100) {
				System.out.print(sum);
				}
			}
		}
	}


