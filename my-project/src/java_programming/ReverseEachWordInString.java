package java_programming;

public class ReverseEachWordInString {

	public static void main(String[] args) {
	
		String str = "welcme to java and oops";
		
		//Approach : 1
//		String[] words = str.split(" ");
//		
//		String rev="";
//		for(String w:words) {
//			
//			String reverseword="";
//			for(int i = w.length()-1;i>=0;i--) {
//				reverseword=reverseword+w.charAt(i);
//			}
//			
//			rev = rev +reverseword+" ";
//			
//		}
//		
//		System.out.println(rev);
//		
		
		
		
		
		//Approach : 2
		
		String str1 = "Welcome to java";
		
		String[] wds = str1.split("\\s");
		
		String reveseString="";
		
		for(String w : wds) {
			StringBuilder sb =new StringBuilder(w);
			sb.reverse();
			reveseString=reveseString+sb.toString()+" ";
			
		}
		
		System.out.println(reveseString);
		
		
		
	}

}
