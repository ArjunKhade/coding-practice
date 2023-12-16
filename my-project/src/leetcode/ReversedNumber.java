package leetcode;

public class ReversedNumber {

	  public static int reverse (int num) {
		  //if num = 0
		  if (num == 0) {
			  return 0;
		  }else {
			  int flag = 1;
			  //if number is negative
			  if(num < 0) {
				  flag=-1;
				  num= -num;
			  }
			  
			  int result  =0;
	
			  //num positive
			  while(num>0) {
				int digit = num%10;
				int  newResult  = result *10+num%10;
				 
			  //if number exceeds int range	
			   if(result!=(newResult-digit)/10) {
				   result=0;
				   break;
			   }
				
				result =newResult; 
				 num = num/10;
			  }
			  
			   return result *flag;
			  
		  }
	  }

	public static void main(String[] args) {
         System.out.println(reverse(15));
	}
}