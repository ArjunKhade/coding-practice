package java_programming;

import java.util.Scanner;

	public class ReverseNumber {
		
			public static void main(String[] args) {
			   
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Number:");
			int num = sc.nextInt();//1234
			
			
		//	Logic:1  Using Algorithm
			
//			int rev=0;
//			while(num!=0) {
//				rev = rev*10 + num%10;//0+4=4,  40+3=43  ,430+2=432, 4320+1=4321
//				num=num/10;//123,12,1
//			}
//			System.out.println("Reverse Number is:"+rev);
			
			/*****************************************************************/
			
			//Logic:2 Using StringBuffer Class
			
//			 StringBuffer sb= new StringBuffer(String.valueOf(num));
//			 
//			 StringBuffer rev =  sb.reverse();
//			
//			 System.out.println("Reverse Number is:"+rev);
//			
			/*********************************************************/
			
			//Logic :3 :Using StringBuilder Class
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(num);
			
			StringBuilder rev = sb.reverse();
			
			 System.out.println("Reverse Number is:"+rev);
			
			
			
			
			
			
			
			
			
			
			sc.close();
	
	
	
}

}
