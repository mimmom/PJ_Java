package pretest;

public class StrEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hi";
		String s2 = new String("hi"); 
		String s3 = "hi";
		
		if (s1==s2) {
			System.out.println("s1 e s2 sono uguali"); 
		} else {
			System.out.println("s1 e s2 non sono uguali");	
		}
		
		if (s1==s3) {
			System.out.println("s1 e s3 sono uguali");
		} else {
			System.out.println("s1 e s3 non sono uguali");
		}
		
	}

}
