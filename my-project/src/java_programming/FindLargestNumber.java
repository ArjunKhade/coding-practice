package java_programming;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Number:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		//Logic 1: simple if else
		
	/*	if(a>b && a>c) {
			System.out.println(a +" Is Largest!!");
		}else if (b> a && b>c) {
			System.out.println(b +" Is Largest!!");
		}else {
			System.out.println(c +" Is Largest!!");
		}
	*/
		//Logic 2: Ternary Operator in java
		
//	         int max = 	a>b?a:b;
//	         
//	         int largest= c>max?c:max;
	         	   
	         	 //  System.out.println(largest +" Is Largest!!");
	         	   
	         	   
	         	  int largest= c >(a>b?a:b)?c:(a>b?a:b);
	         	 System.out.println(largest +" Is Largest!!");
	}
    
    
    
}
