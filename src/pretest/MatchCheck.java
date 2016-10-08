package pretest;

public class MatchCheck {
	
	public static void main(String[] args) {
		
		String[] strings = {
			"Severity 1" , "severity 2" , "severity3",  "severity five"	
		}; 
	
	for (String str : strings) {
		if (!str.matches("^severity[\\s+][1-5]")) {
			
			System.out.println(str  + " non fa match"); 
			
		}
		
	}
	
	}
	
}


