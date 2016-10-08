package pretest;

class InvalidValueException extends IllegalArgumentException{}
class InvalidKeyException extends IllegalArgumentException{}


class BaseClass {
	void foo() throws IllegalArgumentException{
		throw new IllegalArgumentException(); 
	}
	
}


class Dericlass extends BaseClass {
	public void foo() throws IllegalArgumentException {
		throw new InvalidValueException();  
	}
	
}


class DeriDeriClass extends Dericlass{
	public void foo() { // line a
		throw new InvalidKeyException(); 
		
	}
	
}



public class EHTest {

	public static void main(String[] args) {
		
		try {
			BaseClass base = new Dericlass(); 
			base.foo();
			
			
			
		} catch (RuntimeException e) {
			System.out.println(e); 
			
		}
		
	}
	
}


