package stringLogicalNew;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String args[]) {
	
		int a[]= {6,2,8,9,5,3,5};
		System.out.println("Before sort: "+Arrays.toString(a));
		int len = a.length;
		for(int i=0; i<len; i++) {		//Number of Passes
			for(int j=0; j<len-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println("After sort: "+Arrays.toString(a));
		
	
	}
	}