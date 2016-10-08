/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter03_classDesign.listing_3_14;

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public static void main(String[] args) {
		// Passing a Point object to println automatically invokes the toString
		// method
		System.out.println(new Point(10, 20));

		System.out.println(new Point(30, 50));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	// @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [xPos=");
		builder.append(xPos);
		builder.append(", yPos=");
		builder.append(yPos);
		builder.append("]");
		return builder.toString();
	}
	
}
