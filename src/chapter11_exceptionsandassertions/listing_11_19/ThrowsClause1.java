/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter11_exceptionsandassertions.listing_11_19; 
import java.io.*;
import java.util.*;
class ThrowsClause1 {
	public static void main(String []args) throws FileNotFoundException {
		System.out.println("Reading an integer from the file 'integer.txt': ");
		Scanner consoleScanner = new Scanner(new File("integer.txt")); 
System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
	}
}