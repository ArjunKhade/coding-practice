package array;

import java.util.HashSet;
import java.util.Set;

public class FindDupInArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,8,9};
		
		Set<Integer> set = new HashSet<>();
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				flag=true;
				System.out.println("Duplicate Element!!:"+arr[i]);
			}
			set.add(arr[i]);
		}
		if(!flag) {
			System.out.println(-1);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
