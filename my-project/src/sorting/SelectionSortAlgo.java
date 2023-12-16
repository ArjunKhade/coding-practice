package sorting;

public class SelectionSortAlgo {
	
	
	public static void selectionSort(int arr[]) {
		 for (int i = 0; i < arr.length-1; i++) {
			   int minval=arr[i];
			   int minidx=i;
			for (int j = i+1; j < arr.length; j++) {
				 if(arr[j]<minval) {
					 minval=arr[j];
					 minidx=j;
				 }
			}
			
			//swap minidx & i value
			int temp = arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {8,6,3,4,8,9,-1,0,2};
		
		selectionSort(arr);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
		
		

	}

}
