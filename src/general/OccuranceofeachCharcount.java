package general;

import java.util.HashMap;

public class OccuranceofeachCharcount {

	public static void charcount(String InputString) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] c = InputString.toCharArray();
		for(char a:c) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}
			else {
				hm.put(a, 1);
			}}
			System.out.println(InputString+":"+hm);
		}
	public static void main(String[]args) {
		charcount("Mahendra");
		
	}
		
		}
		

