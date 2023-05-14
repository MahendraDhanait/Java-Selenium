package stringLogicalNew;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num = 123456;
		int rem;
		int count=0;
		int len = Integer.toString(num).length();
		for(int i=0; i<len; i++) {  //answer 14
			rem=num%10;
			num=num/10;
			count=count+rem;
		}
		System.out.println(count);

	}

}
