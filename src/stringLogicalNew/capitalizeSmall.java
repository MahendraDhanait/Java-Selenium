package stringLogicalNew;

public class capitalizeSmall {

	public static void main(String[] args) {
		String s= "abcdef";
		String sb= s.substring(0,2)+s.substring(4,6).toUpperCase();
		System.out.println(sb);
	}

}
