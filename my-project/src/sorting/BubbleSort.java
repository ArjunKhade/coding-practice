package sorting;

public class BubbleSort {

	
	
	static void  bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				  if(arr[j]<arr[i]) {
					  //swap
					  int temp = arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
			}
		}
	}
	
	//reverse
//	static void  bubbleSort(int[] arr) {
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j =0; j < arr.length-1-i; j++) {
//				  if(arr[j]<arr[j+1]) {
//					  //swap
//					  int temp = arr[j];
//					  arr[j]=arr[j+1];
//					  arr[j+1]=temp;
//				  }
//			}
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {8,6,3,4,8,9,-1,0,2};
		bubbleSort(arr);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
