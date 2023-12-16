package array;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Number:");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	     System.out.println();
		for(int num: arr) {
			System.out.print(num + " ,");
		}
        System.out.println();
		System.out.println(Arrays.toString(arr));
		
		sc.close();
		
	
	}
	


}
