/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

// The program demonstrates "Object" based implementation and associated lack of type-safety 

package chapter06_genericsandcollections.listing_6_2;

class BoxPrinter {
	private Object val;

	public BoxPrinter(Object arg) {
		this.val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}
}
