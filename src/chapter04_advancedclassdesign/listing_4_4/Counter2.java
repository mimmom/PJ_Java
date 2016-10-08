package chapter04_advancedclassdesign.listing_4_4;

public class Counter2  extends Counter{
	
	public static void printCount() {
		System.out.println("Number of instances created so far is: ");
	}
	
	
	public static void main(String[] args) {
		 printCount(); 
		 Counter.printCount();
	}
	
	
}
