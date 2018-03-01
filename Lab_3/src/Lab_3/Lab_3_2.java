package Lab_3;

/*
 ***************************************************
 * Lab_3_1.java				Author: Badgett/Aaron
 * If and else with
 ***************************************************
 */


import java.util.*;
public class Lab_3_2 {

	public static void main(String[] args) {
		
		/*
		 * Prompt user for mins
		 * Determine call duration
		 * Calculate total
		 * Display call duration and total
		 */
		
		
		//Prompt user for mins
		System.out.print("Enter total mins: "); 
		Scanner input = new Scanner(System.in);
		
		// Determine call duration
		int dur = input.nextInt();
		
		// Calculate total
		double total = 1.99;									// Unavoidable connection fee.
		if (dur > 3)  {total = 1.99 + 2.00 + .45 * (dur);}
		if (dur == 3) {total = 1.99 + 2.00;}
							
		input.close();
		
		// Display call duration and total
		System.out.println("Call Duration: " + dur + " mins");
		System.out.printf("Total = $%.2f", total);

		
		
		
		/*
		switch(dur) {
		
		case 0: // Under 3 mins
				break;
			
		case 1: // = 3mins
				break;
			
		case 2: // more than 3 mins
				break;
			
		case 3: // each additional min
				break;
				
		default: // Total
	}
		*/

}
}