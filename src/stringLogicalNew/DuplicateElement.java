package stringLogicalNew;

public class DuplicateElement {

	public static void main(String[] args) {
		String arr[] = {"1", "2", "3","4"};
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicates :"+ arr[i]);
					flag=true;
				}
			}
		}
		if(flag=false) {
			System.out.println("No duplicates");
		}

	}

}
