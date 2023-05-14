package pkg1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put(3, "Mahendra");
		m.put(4, "wneaevd");
		m.put(47, "sfadf");
		m.put(5000, "gbsdbg");
		m.put(18, "Dhanait");
		
		m.put(4, "wneaevd");
		System.out.println(m);
		System.out.println(m.size());

	}

}
