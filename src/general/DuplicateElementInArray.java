package general;

import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		Object a[]= {"java",123,"c++", "python"};
		HashSet hs = new HashSet();
		boolean flag = false;
		for(Object l:a) {
			if(hs.add(l)==false)
			{
				System.out.println("FOund Duplicate:"+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No duplicate");
		}

	}}


