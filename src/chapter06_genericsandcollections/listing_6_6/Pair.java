/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// It demonstrates the usage of generics in defining classes

package chapter06_genericsandcollections.listing_6_6;

class Pair<T1, T2 > {
	T1 object1;
	T2 object2;
	

	Pair(T1 one, T2 two) {
		object1 = one;
		object2 = two;
 
	}

	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}
	

	
	
}
