package pretest;

public class NullInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null ; 
		if (str instanceof Object) {
			System.out.println("str is Object");
		}else {
			System.out.println("str is not  Object");
		}
		
	}

}
