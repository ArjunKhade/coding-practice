package java_programming;

public class MissingNumberInArray {
	
	public static void main(String[] args) {

		int arr[] = {1,2,4,5};//3- missing number
		
		int sum1 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum1=sum1+arr[i];
			
		}
		
		System.out.println("Sum of Elem:"+sum1);
		
		/**************************************************/
		
		int sum2=0;
		
		for (int i = 0; i <=5; i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("Sum of Elem:"+sum2);
		
		System.out.println("Missing Number:"+(sum2- sum1));
		
	}
}
