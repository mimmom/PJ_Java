/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// A simple progam to accept an integer from user 

package chapter11_exceptionsandassertions.listing_11_2; 
import java.util.*;

class ScanInt {
	public static void main(String [] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in); 
System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
	}
}