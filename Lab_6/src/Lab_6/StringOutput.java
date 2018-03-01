/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 6
 */

/*****************************************************************************************************************
 *
 ******************************************************************************************************************/
package Lab_6;
import java.util.*;
public class StringOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt for a user string
		System.out.print("Enter a String: ");
		String userString = input.nextLine();
		System.out.print("\n\nEntered String: " + userString + "\n\n");
		
		// Pull and count each charachter from the string 
		for(int i = 0; i < userString.length(); i++) {
		    System.out.println("Character #" + i + "\t" + userString.charAt(i));
		}
	input.close();
	}	
}
