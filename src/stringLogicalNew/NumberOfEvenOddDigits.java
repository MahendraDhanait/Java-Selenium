package stringLogicalNew;

public class NumberOfEvenOddDigits {

	public static void main(String[] args) {
		int num = 123456789;
		int evencount=0;
		int oddcount = 0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {evencount++;}
			else {oddcount++;}
			num=num/10;}
		System.out.println("Evencount :"+evencount);
		System.out.println("Oddcount :"+oddcount);}}
