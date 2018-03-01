package Lab_4;
import java.util.*;
import java.lang.*;
public class KeyPad {

	public static void main(String[] args) {
		
		// Prompt user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
		// Determine corresponding number and display
		int number = 0;
		
		// If upper case
		
		//switch(Character.isUpperCase(ch)) {}
		
		if (Character.isUpperCase(ch)) {								//Try using Switch instead 
			if (ch >= 'W')
				number = 9;
			
			else if (ch >= 'T')
				number = 8;
			
			else if (ch >= 'P')
				number = 7;
			
			else if (ch >= 'M')
				number = 6;
			
			else if (ch >= 'J')
				number = 5;
			
			else if (ch >= 'G')
				number = 4;
			
			else if (ch >= 'D')
				number = 3;
			
			else if (ch >= 'A')
				number = 2;
			
			System.out.println("The corresponding number is " + number);		}
		
		// If lower case
		else if (Character.isLowerCase(ch)) {
			if (ch >= 'w')
				number = 9;
			
			else if (ch >= 't')
				number = 8;
			
			else if (ch >= 'p')
				number = 7;
			
			else if (ch >= 'm')
				number = 6;
			
			else if (ch >= 'j')
				number = 5;
			
			else if (ch >= 'g')
				number = 4;
			
			else if (ch >= 'd')
				number = 3;
			
			else if (ch >= 'a')
				number = 2;
			
			System.out.println("The corresponding number is " + number);
		}
		else {
			System.out.println(letter + " is an invalid input");
		}
		
		/*
		int j = input.nextInt(); // (int)'a' is 97 
		System.out.println("j is " + j); // j is 99 
		System.out.println(j + " is the Unicode for character " + (char)j); // 99 is the Unicode for character c 
		System.out.println("Chapter " + '2');
		
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		*/
	}

}
