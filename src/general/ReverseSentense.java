package general;

public class ReverseSentense {
	public static void main(String args[]) {
		
		String str = "India Is My Country";
		String[] words = str.split(" ");
		String reversestring=" ";
		for(String w:words) {
			String reversewords= "";
			for(int i=w.length()-1;i>=0;i--)
			{
				reversewords=reversewords+w.charAt(i);
			}
			reversestring = reversestring + reversewords +"  ";
		}
		System.out.println(reversestring);
	}
}

	


