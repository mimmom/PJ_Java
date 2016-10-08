package pretest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList<>(Arrays.asList(1,"two",3.0)); // one
		List list2 = new LinkedList<>(Arrays.asList(new Integer(1), new Float(2.0F), new Double(3.0))); // two
		list1 = list2; // three
		for (Object element : list1) {
			
			System.out.print("element =" + " ");
		}
		
	}

}
