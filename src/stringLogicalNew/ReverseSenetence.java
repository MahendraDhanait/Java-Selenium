package stringLogicalNew;

public class ReverseSenetence {

	public static void main(String[] args) {
		
		String s= "my mobile";
		String[] arr = s.split("\\s");
		String ReverseString = "";
		for(String Property:arr) {
			String Rwords = "";
			for(int i=Property.length()-1; i>=0; i--) {
				Rwords= Rwords+Property.charAt(i);
			}ReverseString=ReverseString+Rwords+" ";	
		}
		System.out.println(ReverseString);}}
		
