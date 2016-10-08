/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Demonstrates searching a character in a string

package chapter07_stringprocessing.listing_7_1;

public class SearchString1 {
	public static void main(String[] s) {
		String str = "OCPJP";
		// ricerca per carattere
		System.out.println("Character J occurs at index: " + str.indexOf('J'));

		// se nnon lo trova restituisce -1
		System.out.println("Character J occurs at index: " + str.indexOf('F'));

	}
}