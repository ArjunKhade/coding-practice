package java_programming;

public class RemoveJunkSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//remove special char
		String s = "45@#*/arjun 0123456789 ";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		//remove whitespace
		
		String str = "java prog languge";
		
	     str = str.replaceAll("\\s","" );
		
		System.out.println(str);
		
		
		
		
	}

}
