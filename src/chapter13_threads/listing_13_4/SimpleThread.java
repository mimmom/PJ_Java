/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter13_threads.listing_13_4;

class SimpleThread {
	public static void main(String[] s) {
		Thread t = new Thread();
		t.setName("Thread domenico manno");
		t.setPriority(Thread.MAX_PRIORITY); 
		System.out.println(t);
		
	}
}