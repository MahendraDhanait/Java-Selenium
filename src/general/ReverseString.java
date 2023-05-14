package general;

public class ReverseString {
	public static void main(String [] args ) {
		
		String st = "ABCD";
		String rev = "";
		
		// Approach1
		/*int length = st.length();
		for(int i=length-1; i>=0; i--) 
		{
			rev = rev + st.charAt(i);
		}*/
		
		//Approach2
		/*char a[]= st.toCharArray();
		int len = a.length;
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}*/
		
		//Appraoch3
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
		
		
		
		//System.out.println(rev);
	}
}


