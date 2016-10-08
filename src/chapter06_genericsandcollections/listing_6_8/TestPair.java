/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter06_genericsandcollections.listing_6_8;

class TestPair {
	public static void main(String[] args) {
		Pair<Integer, String> worldCup = new Pair<>(2010, "South Africa");
		System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());
		
		//Pair<Integer, String> worldCup2 = new Pair(2010, "South Africa");
		Pair<Integer, String> worldCup2 = new Pair<>(2010, "South Africa");
		System.out.println("World cup " + worldCup2.getFirst() + " in " + worldCup2.getSecond());
	}
}