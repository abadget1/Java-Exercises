/* Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Assignment: 1
 */

package HW_1;
// import java.util.*;
import java.util.Scanner;
public class HelloWorld {
	// This program simply prints out a hello statement to the user.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = s.nextLine();
		System.out.println("Hello " + name + "! Welcome to Java!");
		s.close();
	}

}
