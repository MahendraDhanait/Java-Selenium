package stringLogicalNew;

public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[]= {13,15,18,21,21};
		int searchElement= 21;
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(searchElement==arr[i]) {
				System.out.println("Element is:"+arr[i]);
				flag= true;
				break;
			}
			
		}
		if(flag=false) {
			System.out.println("No duplicate");
		}

	}

}
