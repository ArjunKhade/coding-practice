package string;
import java.util.Stack;
public class ParenthesisMatching {
  public  static	boolean isParenthesisMatching(String str) {
	  Stack<Character> s = new Stack<>();
	  
	  for (int i = 0; i < str.length(); i++) {
		  if(str.charAt(i)=='{'
				  || str.charAt(i)=='['
				  ||str.charAt(i)=='{' ) {
			  s.push(str.charAt(i));
		  }else if(!s.isEmpty()&&
				  (str.charAt(i)=='}' && s.peek()=='{')||
				  (str.charAt(i)==']' && s.peek()=='[')||
				  (str.charAt(i)==')' && s.peek()=='(')) {
			  
			  s.pop();
			
		}else {
			s.push(str.charAt(i));
		}
	}
	  
	return s.isEmpty()?true:false;
  }
	
 
	
	public static void main(String[] args) {

         String s = "{}";
         if(isParenthesisMatching(s)) {
        	 System.out.println("Balanced");
        	 
         }else {
        	 System.out.println("Not Balanced");
         }
	}

}
