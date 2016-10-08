package pretest;

public class EHBehavior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10 / 0; // line a
			System.out.print("after throw ->");

		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.print("presente in catch ->");
			return;
		} finally {
			System.out.print("presente in finally");
		}

		System.out.print("dopo ogni cosa , ala fine ");

	}

}
