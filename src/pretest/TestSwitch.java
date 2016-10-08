package pretest;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cards = {
				"Club","spade","diamond", "hearts", 
		}; 
		
		for (String card : cards) {
			switch (card) {
			case "Club": System.out.print("Club");
				break;

			case "spade": System.out.print("spade");
			break;
		
			case "diamond": System.out.print("diamond");
			break;
		
			case "hearts": System.out.print("hearts");
			break;
		
			
			default: System.out.print("nessuna estrazione"); 
				
			}
	
		}
		
				
	}

}
