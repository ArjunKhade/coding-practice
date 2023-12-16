package java_programming;

public class CountEvenOdd {
	public static void main(String[] args) {
		int num = 12345;
		int evenCount=0;
		int oddCount=0;
		
		while(num>0) {
			
			int rem = num%10;
			
			if(rem%2 ==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
			num =num/10;
			
		}
		
		System.out.println("EvenCount:"+evenCount+" , "+"OddCount:"+oddCount);
	}

}
