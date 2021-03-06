/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of TreeSet class

package chapter06_genericsandcollections.listing_6_17;

import java.util.*;

class TreeSetTest {
	public static void main(String[] args) {
		String pangram = "the quick brown fox jumps over the lazy dog";
		Set<Character> aToZee = new TreeSet<Character>();
		for (char gram : pangram.toCharArray())
			aToZee.add(gram);
		System.out.println("The pangram is: " + pangram);
		System.out.print("Sorted pangram characters are: " + aToZee);
	}
}
