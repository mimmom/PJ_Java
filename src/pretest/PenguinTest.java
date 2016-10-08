package pretest;

public class PenguinTest {

	public static void main(String[] args) throws CannotFlyException {
		// TODO Auto-generated method stub
		
		//Penguin pingu = new Penguin();
		//pingu.walk(); 
	//	pingu.fly(); 
		
	}

}


class CannotFlyException extends Exception{};

interface Birdie {
	public abstract void fly() throws CannotFlyException; 
}

interface Bipied{
	public void walk(); 
	
}


abstract class NonFlyer{
	public void Fly(){
		System.out.println("cannot fly");  //Line A 
	}
}

/*
class Penguin extends NonFlyer implements Birdie, Bipied{  //line b
	public void walk(){
		System.out.print("walk");
		
	}
}
*/
