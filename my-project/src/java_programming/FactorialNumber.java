package java_programming;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		long factorial = 1;
		
		//incresing
//		for(int i = 1; i <= num; i++) {
//			factorial=factorial*i;
//		}
//		
//		System.out.println("Ans:"+factorial);
		
		
		//decreasing
		for(int i = num; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println("Ans:"+factorial);
		
		
	}

}
