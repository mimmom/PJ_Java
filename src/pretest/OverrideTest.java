package pretest;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Base{
	
	public static void foo(Base bObj){
		System.out.println("IN Base.foo"); 
		bObj.bar(); 
		
	}
	
	
	public void bar(){
		System.out.println("In Base.bar()"); 
		
	}
	
}


class Derived extends Base {
	
	public static void foo(Base bObj){
		System.out.println("In Derived.foo() "); 
		bObj.bar();
	}
	
	public void bar(){
		System.out.println("In Derived.bar()"); 
	}
	
}
