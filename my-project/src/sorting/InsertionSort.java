package sorting;

public class InsertionSort {

	
	static void insertionSort(int arr[]) {
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]> key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr [] = {8,6,3,4,8,9,-1,0,2};
		
       insertionSort(arr);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
