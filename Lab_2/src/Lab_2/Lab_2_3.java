package Lab_2;

/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 2
 */

// This program reads variables to test reading and print out values for all Java primitive types.
import java.util.Scanner;
public class Lab_2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		  byte byte_value;
	      short short_value;
	      int int_value;
	      long long_value;
	      float float_value;
	      double double_value;
		
	     // Prompt the user to enter the variables.
		System.out.print("Enter a byte value: "); 
		byte_value = input.nextByte();
		
		System.out.print("Enter a short value: "); 
		short_value = input.nextShort();
		
		System.out.print("Enter an int value: "); 
		int_value = input.nextInt();

		System.out.print("Enter a long value: "); 
		long_value = input.nextLong();
		
		System.out.print("Enter a float value: "); 
		float_value = input.nextFloat();
		
		System.out.print("Enter a double value: "); 
		double_value = input.nextDouble();
		
		// Print out/test the values.
		System.out.println ("The byte value is:\t\t" + byte_value);
		System.out.println ("The short value is:\t\t" + short_value);
		System.out.println ("The int value is:\t\t" + int_value);
		System.out.println ("The float value is:\t\t" + float_value);
		System.out.println ("The long value is:\t\t" + long_value);
		System.out.println ("The double value is:\t\t" + double_value);

	}
}