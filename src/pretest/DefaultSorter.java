package pretest;

import java.util.Arrays;


public class DefaultSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bricks= {
			"brasile", "russia"	,"india ", "cina" 
		}; 
		
		Arrays.sort(bricks, null);
		for (String country : bricks) {
			System.out.print(country + " ");
			
		}
	}

}

