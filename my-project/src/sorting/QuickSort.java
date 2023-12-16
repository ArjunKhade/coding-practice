package sorting;

import java.util.Arrays;

//Worst= O(n^2); Average=O(nlogn)
//Average case most frequnt , No extra space for array
public class QuickSort {
	
	public static void quickSort (int arr[],int low,int high) {
		if(low<high) {
			int pivotIndex = partition(arr,low,high);
			quickSort(arr, low, pivotIndex-1);
			quickSort(arr, pivotIndex+1, high);
		}
	}
	
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[high];//take last elem as pivot
		int i = low-1;//make space for store small elem
		
		for (int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				//swap	i,j 			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		int [] arr = {6,3,2,5,7,9,8};
		
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
			System.out.print("Quick Sort:"+Arrays.toString(arr));
	
	}

	
	
	
	
	
	
	
}
