package pretest;

public class AssertionFailure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			assert false; 
		} catch (RuntimeException re) {
			System.out.println("in runtime exception"); 
		}catch (Exception e) {
			System.out.println("Exception"); 

		}catch (Error e) {
			System.out.println("Error");
		}catch (Throwable e) {
			System.out.println("Throwable"); 
			
		}
		
		
		
	}

}
