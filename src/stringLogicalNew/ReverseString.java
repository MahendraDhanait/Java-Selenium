package stringLogicalNew;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "ASSfA";
		String org =s;
		String rev="";
		int len = s.length();
		
		for(int i=len-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(org)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("No Palindrome");}
		
	}

}
