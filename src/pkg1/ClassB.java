package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassB {

	public static void main(String[] args) {
		
		String s = "abbcc12343433444";
		
		List list = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			
			list.add(s.charAt(i));
			
		}
		
		Set set = new HashSet(list);

		System.out.println("List output:"+list);
		System.out.println(list.size());
		System.out.println("Set output:"+set);
		System.out.println(set.size());
		
				
		//System.out.println(set);
	}

}
