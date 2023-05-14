package pkg1;

public class ClassD {

	public static void main(String[] args) {
		
		String s = "ABBbcd1234@#%";
		
		/*String p = s.replaceAll("[0-9]", "");
		
		String q= s.replaceAll("[^0-9]", "");
		
		String d = s.replaceAll("[0-9A-z]", "");
		
		System.out.println(p+" "+q+" "+ d);*/
		
		String a = s.replaceAll("[A-Z]", "");
		String b = s.replaceAll("[A-z]", "");
		String c = s.replaceAll("[^A-z]", "");
		String d = s.replaceAll("[0-9A-z]", "");
		String e = s.replaceAll("[A-Z]", "");
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		
		
		
		

	}

}
