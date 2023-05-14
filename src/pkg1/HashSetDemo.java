package pkg1;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet s = new HashSet();
		Set s = new HashSet();
		s.add(100);
		s.add(110);
		s.add("Welcome");
		s.add(null);
		s.add(200);
		s.add(100);
		s.add(null);
		s.add(100);
		System.out.println(s);
		s.add(5000);
		System.out.println("Add   "+s);
		s.remove(100);
		System.out.println("Remove   "+s);
		for(Object x:s) {
			System.out.println(x);
			
		}
		
	}

}
