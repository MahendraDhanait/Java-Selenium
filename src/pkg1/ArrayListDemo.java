package pkg1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		//List ar = new ArrayList();
		
		ar.add(100);
		ar.add(13);
		//ar.add("Welcome");
		ar.add(110);
		//ar.add(null);
		ar.add(100);
		//ar.add(null);
		ar.add(150);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.remove(3);
		System.out.println("After removing 110+:  "+ar);
		// insert value in between
		ar.add(4, 1300000);
		System.out.println("After adding 4 index: "+ar);
		// capture specific value
		
		System.out.println("Index 4 is :"+ar.get(4));
		//Read all data
		for(Object x:ar) {
			System.out.println(x);
		}
		// clear all data
		ar.clear();
		System.out.println(ar);
		
		
	}

}
