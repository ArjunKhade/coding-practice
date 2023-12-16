package array;

public class BinerySearchArrayCeilingFloor {

	
	 static int binarySearch(int arr [],int target) {
		 int start = 0;
		 int end = arr.length - 1;
		 
		 while(start <= end) {
			 int mid = start + (end - start)/2;
			 
			 if(target < arr[mid]) {
				 end = mid -1;
			 }else if (target > arr[mid]){
				 start = mid+1;
			 }else {
				 return mid;
			 }
			 
		 }
		 return -1;
	 }
	
	 /**************************************/
	 
	 static int ceiling(int arr [],int target) {
		 if(target > arr[arr.length-1]) {
			 return -1;
		 }
		 
		 int start = 0;
		 int end = arr.length - 1;
		 
		 while(start <= end) {
			 int mid = start + (end - start)/2;
			 
			 if(target < arr[mid]) {
				 end = mid -1;
			 }else if (target > arr[mid]){
				 start = mid+1;
			 }else {
				 return mid;
			 }
			 
		 }
		 return start;
	 }
	
	 
	 /*************************************/
	 
	 static int floor(int arr [],int target) {
		 
		 int start = 0;
		 int end = arr.length - 1;
		 
		 while(start <= end) {
			 int mid = start + (end - start)/2;
			 
			 if(target < arr[mid]) {
				 end = mid -1;
			 }else if (target > arr[mid]){
				 start = mid+1;
			 }else {
				 return mid;
			 }
			 
		 }
		 return end;
	 }
	
	/******************************/
	 public char nextGreatestLetter(char[] letters, char target) {
	        int start = 0;
	        int end = letters.length-1;
	        while(start <= end){
	            
	            int mid = start + (end -start)/2;
	            if(target < letters[mid]){
	                end = mid-1;  
	            }else{
	                start = mid+1;
	            }
	        }
	        return letters[start % letters.length];
	    }
	 
	 
	 /*****************************/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr [] = {2,3,4,5,6,8};
       System.out.println(binarySearch(arr,5));
       System.out.println(ceiling(arr,10));
       System.out.println(floor(arr,1));
	}

}
