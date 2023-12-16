package java_programming;

public class SumOfElementsInArray {
	
	public static void main(String[] args) {
       
		 int [] arr = {5,2,7,9,6};
		
		 int sum=0;
		 
		
//		for (int i = 0; i < arr.length; i++) {
//			 sum= sum+arr[i];
//		}
//		
//		System.out.println(sum);
		
		 
		 
		//Enhanced for loop
		for(int a : arr) {
			sum=sum+a;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}
}
