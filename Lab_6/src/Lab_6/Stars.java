/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 6
 */

/*****************************************************************************************************************
 * Write a Java program (called Stars) that uses nested loops to print out the following shape.
 
  			**********
  			*********
 			********
 			*******
 			******
 			*****
 			****
 			***
 			**
 			* 
 
 ******************************************************************************************************************/
package Lab_6;
public class Stars {
	public static void main(String[] args) {
		
		// Initialize max amount of rows (1 to 10 rows)
		final int MAX_ROWS = 10;
		
		for (int row = 1; row <= MAX_ROWS; row++) {			// Print a row until we have 10 rows
			System.out.println();

			// Initialize amount of stars per row 
			for (int star = 10; star >= row; star--) 		// 10 stars on row one down to 1 star.
				System.out.print ("*");
		}
	}
} 
	


