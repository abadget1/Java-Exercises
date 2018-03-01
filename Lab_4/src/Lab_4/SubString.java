package Lab_4;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
		/*
		 * Prompt user for 2 strings
		 * Determine is string 2 is a substring of string 1
		 */
		
		// Prompt user for 2 strings
		Scanner input = new Scanner (System.in);
		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();
		
		// Determine is string 2 is a substring of string 1
		System.out.println(s2 + (s1.contains(s2) ? " is" : " is not") +" a substring of s1.");
		
		input.close();
	}

}
