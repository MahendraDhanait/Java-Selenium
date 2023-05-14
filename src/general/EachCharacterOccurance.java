package general;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterOccurance {

	public static void main(String[] args) {
		String s ="aa AA  ccc sss";
		Map<Character, Integer> Hmap = new HashMap<>();
		char[] c = s.toCharArray();
		for(char ch:c) {
			if(Hmap.containsKey(ch)) {
				Hmap.put(ch, Hmap.get(ch)+1);
			}
			else {
				Hmap.put(ch, 1);
			}
		}
		System.out.println(Hmap);

	}

}
