package general;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int search= 30;
		boolean flag=false;
		for(int i=0; i<a.length-1;i++) {
			if(search==a[i]) {
				System.out.println("Elemet found");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("No element available");
		}

	}

}
