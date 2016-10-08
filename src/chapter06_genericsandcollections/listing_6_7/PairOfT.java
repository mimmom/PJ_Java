/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows how to use generics in your programs

package chapter06_genericsandcollections.listing_6_7;

class PairOfT<T> {
	T object1;
	T object2;

	PairOfT(T one, T two) {
		object1 = one;
		object2 = two;
	}

	public T getFirst() {
		return object1;
	}

	public T getSecond() {
		return object2;
	}
	
		
	
   public static void main(String[] args) {
	// errore parametrizzata con un solo tipo e non con due tipi
	  // PairOfT<Integer , String > xx = new PairOfT<Integer, String >(5, "domenico"); 
	   
	   PairOfT<String > xxx = new PairOfT< String >( "domenico" , "pippo");
	   PairOfT<Integer  > ddxx = new PairOfT<Integer >(5, 10);
	   
	    String c =  xxx.getFirst(); 
	   
	    
 }
	
	
	
}