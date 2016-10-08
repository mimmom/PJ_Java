package pretest;

public class Increment {

	public static void main(String[] args) {
		Integer i = 10; 
		Integer j = 11;
		Integer k = ++i;
		
		System.out.println("k==j is " + (k==j)); 
		System.out.println("k.equals(j) is " + (k.equals(j)));
		
	}

}
