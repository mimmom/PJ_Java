/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter06_genericsandcollections.listing_6_3;

class BoxPrinterTest2 {
	public static void main(String[] args) {
		BoxPrinter value1 = new BoxPrinter(new Integer(10));
		System.out.println(value1);
		Integer intValue1 = (Integer) value1.getValue();

		BoxPrinter value2 = new BoxPrinter("Hello world");
		System.out.println(value2);
		// OOPs! by mistake, we did (Integer) cast instead of (String)
		
			// Integer intValue2 = (Integer) value2.getValue();
	   String  strValue =   (String) value2.getValue();
		System.out.println(strValue);
	}
}