
/* 
 * Class: CS 1301/06
 * Term: Spring 2018
 * Name: Aaron Badgett
 * Instructor: Monisha Verma
 * Lab: 5
 */

/**************************************************************************************************
 * This program prompts the user to enter a year and the first three letters of 
 * a month name (with the first letter in uppercase) and displays the number of days in the month.
 * 
 * Sample run:
 * Enter a year: 2001
 * Enter a month: Jan
 * Jan 2001 has 31 days
 **************************************************************************************************/

package Lab_5;
import java.util.*;
public class MonthDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user for year and month
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String month = input.next();
		
		// Determine the amount of days in each month and display correspoding output
		switch (month.toLowerCase()) {
        case "jan": case "mar": case "may": case "jul": case "aug": case "oct":
        case "dec":
        		int days = 31;
                System.out.println(month + " has " + days + " days.");
        		break;
            
        case "apr": case "jun": case "sep": case "nov":
            days = 30;
            System.out.println(month + " has " + days + " days.");
            break;
            
        case "feb":
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))		// Calculation for leap year
                days = 29;
            else
                days = 28;
            System.out.println(month + " has " + days + " days.");
            break;
            
            default: System.out.println("Invalid input.");
            
		}
		input.close();
	}
}
