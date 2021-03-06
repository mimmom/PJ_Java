/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter07_stringprocessing.listing_7_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This program demonstrates how we can manipulate text
public class Regex6 {
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, , Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
		Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
		Matcher matcher = pattern.matcher(str);
		String newStr = matcher.replaceAll("$1$2-$3$4");
		System.out.println(newStr);
	}
}