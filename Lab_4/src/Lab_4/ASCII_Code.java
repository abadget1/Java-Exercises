package Lab_4;
import java.util.*;
import java.lang.*;
public class ASCII_Code {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int i = input.nextInt();
		System.out.println("The character for ASCII code " + i + " is " + (char)i);
	}

}
