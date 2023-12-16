package array;
//array first half sorted asc and second half in desc
public class FindPeakInMountaiArray {

    static int peakIndexMountaineArray(int [] arr ) {
    	
    	int start = 0;
    	int end = arr.length-1;
    	
    	while(start<end) {
    		int mid = start+(end-start)/2;
    		
    		if(arr[mid]> arr[mid+1]) {
    			end = mid;
    		}else {
    			start=mid+1;
    		}
    	}
    	
    	return start;
    }
	

	public static void main(String[] args) {
    
		int [] arr = {1,2,3,4,3,2,1};
        System.out.println(peakIndexMountaineArray(arr));
	}

}
