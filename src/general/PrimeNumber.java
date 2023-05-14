package general;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/*int a = 13;
		int temp =0;
		
		for(int i=2;i<=a-1;i++) {
			if((a%i)==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}*/
		
		int a=13;
		int count =0;
		if(a>1) {
			for(int i=1; i<=a; i++) {
				if(a%i==0)
					count++;
				}
				if(count==2) {
					System.out.println("prime");
				}
			else{
				System.out.println("np");
			}
	}
	else {
		System.out.println("no");
	}
}

}
