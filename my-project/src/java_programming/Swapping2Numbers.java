package java_programming;

public class Swapping2Numbers {
	

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
				
		System.out.println("Before swapping:" + a +"  "+b);
		/*************************************/ 
		//logic 1 third variable
//		int temp = a;
//		 a=b;
//		 b=temp;
		// System.out.println("Logic:1 : After swapping:" + a +"  "+b);
		/*************************************/ 
		 //logic 2   +,- operator
		 
//		 a=a+b;//10+20=30
//		 b=a-b;//30-20=10
//		 a=a-b;//30-10=20
//		 
//		 System.out.println("Logic:2 : After swapping:" + a +"  "+b);
		 
		/**********************************************/
		// logic 3  *,/ operator
		 
//		a=a*b;//10*20=200
//		b=a/b;//200/20=10
//		a=a/b;//200/10=20
//		
//		System.out.println("Logic:3 : After swapping:" + a +"  "+b);
		
		
		/************************************************/
		//Logic 4  - bitwise operator XOR (^)
		
//		a=a^b;//30
//		b=a^b;//10
//		a=a^b;//20
//		
//		System.out.println("Logic:4 : After swapping:" + a +"  "+b);
		
		/**************************************************/
		//Logic:5 //in single line
		
		b=a+b-(a=b);
		
		//exc roight -to left (a=b) => b value assigned to a=20
		//a+b = 10+20 =30
		 //b= 30-20=10
		//a=20 , b=10 swapped
		
		System.out.println("Logic:5 : After swapping:" + a +"  "+b);
	}
}
