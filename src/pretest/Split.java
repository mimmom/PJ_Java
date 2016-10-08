package pretest;

import java.util.regex.Pattern;



public class Split {
	
	public static void main(String[] args) {
		String date = "10-01-2012"; 
		String[] dateParts = date.split("-"); 
		System.out.print("Usind String.split method: ");
		
		for (String part : dateParts) {
			System.out.print(part);
			
		}
		
		System.out.print("\n Using regex pattern: ");
		Pattern datePattern = Pattern.compile("-");
		dateParts = datePattern.split(date);
		
		for (String part : dateParts) {
			System.out.print(part + " ");
			
		}
		
		
	}
	
	
}
