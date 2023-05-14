package general;

public class OccuranceofCharacter {
	
	public static void main(String []args) {
		
		String s = "Java Programming";
		int count = s.length();
		int removeP = s.replace("P", "").length();
		int totalP=count-removeP;
		System.out.println("count of P: " +totalP);
	}

}
