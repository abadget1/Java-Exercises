package Lab_3;

/*
 ***************************************************
 * Lab_3_1.java				Author: Badgett/Aaron
 * If and else with
 ***************************************************
 */


import java.util.*;
public class Lab_3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("Please enter a single character:");
		// char c2 = c1.next(0);		c2 = character.toUpperCase(c2);
		
		String c1 = input.next();
			
		
			if ((c1.charAt(0) == 'a') || 
	            (c1.charAt(0) == 'e') ||
	            (c1.charAt(0) == 'i') || 
	            (c1.charAt(0) == 'o') ||
	            (c1.charAt(0) == 'u') ||
	            (c1.charAt(0) == 'A') || 
      	        (c1.charAt(0) == 'E') ||
	        	    (c1.charAt(0) == 'I') || 
	        	    (c1.charAt(0) == 'O') ||
	        	    (c1.charAt(0) == 'U')) {
				System.out.println("The character " + c1 + " is a vowel.");
	                }
			
			else {
				System.out.println("The character " + c1 + " is not vowel.");
	                }
			
	                input.close();
	}
}