
/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter03_classDesign.listing_3_11;

class Overloaded {

	public static void aMethod(long val1, int val2)  {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, long val2) {
		System.out.println("int, long");
	}
	
	
	// errore di compilazione caso di ambiguità
	public static void main(String[] args) {
		 //   aMethod(9, 10);
	}

}