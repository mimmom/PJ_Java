/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter14_concurrency.listing_14_15;
class ARunnable implements Runnable {
	public void run() {
		System.out.println("Running the created thread "); 
	}
}
