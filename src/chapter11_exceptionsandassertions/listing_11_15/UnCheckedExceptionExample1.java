/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter11_exceptionsandassertions.listing_11_15; 
import java.io.*;

class UnCheckedExceptionExample1 {
	public static void main(String []args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(args[0]);
	}
}