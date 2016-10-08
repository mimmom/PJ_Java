package pretest;

public class Book extends AbstractBook implements Sleepy {

	public Book(String name){
		//this.name = name;  // line A 
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractBook philosophy = new Book("principi matematici"); 
		System.out.println("il nome del libro è " + philosophy.name); 
	}

}

abstract class AbstractBook{
	
	public String name; 
}

interface Sleepy{
	public String name = "undefined"; 
	
}

