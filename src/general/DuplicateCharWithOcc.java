package general;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharWithOcc {
	
	

	public static void main(String[] args) {
		
		String s= "ABBCCCDDEGG";
		Map<Character, Integer> hm= new HashMap<>();
		char[] character = s.toCharArray();
		for(char key:character)
		{
			if(Character.isAlphabetic(key))		// to remove space count
			if(hm.containsKey(key)) {
				hm.put(key, hm.get(key)+1);
			}
			else {
				hm.put(key, 1);
			}
		}
		hm.entrySet().removeIf(i->i.getValue()==1);
		System.out.println(hm);
		
	}

}
