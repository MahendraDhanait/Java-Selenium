package general;

public class palindromeString {

	public static void main(String[] args) {
		/*String s = "ABcCba";
		String org=s;
		String rev="";
		int len= s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+s.charAt(i);
		}
		if(org.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {System.out.println("No palindrome");}
	}*/
		int a= 1233213;
		int org = a;
		int rev=0; int rem;
		while(a>0) 
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			}
		if(org==rev) {
			System.out.println("Palindrome");
		}
		else {System.out.println("no");
		}
		}
	}
