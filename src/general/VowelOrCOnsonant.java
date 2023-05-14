package general;

public class VowelOrCOnsonant {

	public static void main(String args[]) {
		
		/*char c= 'i';
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
			System.out.println(c+" is vowels");
		}
		else {
			System.out.println(c+" is Consonant");
		}*/
		
		int a= 1234567899;
		int count= 0;
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
}
