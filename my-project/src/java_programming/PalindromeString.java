package java_programming;

public class PalindromeString {
      public static void main(String[] args) {
		String str = "MADAM";
		String org_str=str;
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}		
		
		if(org_str.equals(rev)) {
			System.out.println(org_str+" Palindrome String !!!");
		}else {
			System.out.println(org_str+" Not Palindrome String !!!");
		}
	}
}
