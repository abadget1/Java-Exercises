// Program GasMileage.java
// Demonstrate the use of the Scanner class to read numeric data.

package Lab_0;
import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
	
		// Calculates fuel efficiency based on values entered by the user.   
		
		int miles;
		double gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of miles: ");
		miles = scan.nextInt();
			
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
	
		mpg = miles / gallons;
		System.out.println("Miles per gallon: " + mpg);
		
		scan.close();
	}
}
