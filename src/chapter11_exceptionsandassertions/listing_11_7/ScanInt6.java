/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter11_exceptionsandassertions.listing_11_7; 
import java.util.*; 

class ScanInt6 {
	public static void main(String [] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in); 
		try { 
			System.out.println("You typed the integer value: " + 
					consoleScanner.nextInt()); 
			System.out.println("Done reading the text... closing the Scanner"); 
			consoleScanner.close(); 
		} catch(Exception e) {
			// call all other exceptions here ...
System.out.println("Error: Encountered an exception and could not read an integer from the console... "); 
System.out.println("Exiting the program - restart and try the program again!");
		}
	}
}