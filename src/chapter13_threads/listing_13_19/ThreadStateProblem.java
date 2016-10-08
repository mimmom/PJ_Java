/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter13_threads.listing_13_19; 
class ThreadStateProblem {
	public static void main(String []s) {
		Thread thread = new Thread();
		thread.start();
		thread.start();
	}
}

