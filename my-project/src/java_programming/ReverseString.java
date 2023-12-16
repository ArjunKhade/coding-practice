package java_programming;

public class ReverseString {
	
	
			public static void main(String[] args) {
				
			  String str = "ABCD";
			 
//			    String rev="";
//			    Logic 1 : Using For loop String concatenation operator (+)
//			  for (int i = str.length()-1; i >=0; i--) {
//				 rev= rev+ str.charAt(i);
//			   }
//			
//			  		System.out.println("Reverse:"+rev);
			  
		/***************************************************/	  
			
			 //Logic:2  Using Char Array
			  		
//			  	char [] arr = str.toCharArray();	
//			  
//			  	String rev1 = "";
//			  	for (int i = arr.length-1; i >=0; i--) {
//					rev1=rev1+arr[i];
//				}
//			    System.out.println("Reverse:"+rev1);
			
			
			/**********************************************/
			//Logic : 3 Using String Buffer Class
			
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
			
			
		}
}
