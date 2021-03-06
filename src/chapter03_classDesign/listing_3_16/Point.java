/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter03_classDesign.listing_3_16;

public class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// override the equals method to perform
	// "deep" comparison of two Point objects

	public boolean equals(Point other) {
		if (other == null)
			return false;
		// two points are equal only if their x and y positions are equal
		if ((xPos == other.xPos) && (yPos == other.yPos))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = new Point(10, 20);
		System.out.println("p1 equals p2 is " + p1.equals(p2));
		System.out.println("p1 equals p3 is " + p1.equals(p3));

		Object p4 = new Point(10, 20);
		Object p5 = new Point(50, 100);
		Object p6 = new Point(10, 20);

		System.out.println("p4 equals p5 is " + p4.equals(p5));
		System.out.println("p4 equals p6 is " + p4.equals(p6));

	}
}