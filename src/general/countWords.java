package general;

import java.util.Scanner;

public class countWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		int count = 1;
		for(int i=0; i<s.length()-1;i++)
		{
			if((s.charAt(i) == ' ') && (s.charAt(i+1)!= ' '))
			
			{count++;}
		}
		System.out.println(count);
		
		
		
		/*String st = "I love my country";
		String []words = st.trim().split("");
		System.out.println(words.length);*/

	}

}
