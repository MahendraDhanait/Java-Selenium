package general;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		/*int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		x = sc.nextInt(); 
		System.out.println("Enter y");
		y = sc.nextInt();
		System.out.println("Enter z");
		z = sc.nextInt();
		
		int t = x;
		x=y;
		y=z;
		z=t;
				
		
		System.out.print("After Swapping: "+x+"  "+y+"  "+z);
		}*/
		
		//public static void main(String[] args) {
			int x, y, z;
			System.out.println("Enter x y");
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt(); y = sc.nextInt();
			System.out.println("Before swapping"+x+ "  "+y);
			z = x; x = y; y = z;
			System.out.println("After swapping "+x+ " "+y);
			}
			}
	
