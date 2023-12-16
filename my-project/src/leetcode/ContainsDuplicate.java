package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> hs = new HashSet<>();
	        
	        for(int i=0;i<nums.length;i++){
	            if(hs.contains(nums[i]))return true;
	             hs.add(nums[i]);
	        }
	        return false;
	    }

	 // Approach second 
	 public boolean containsDuplicate2(int[] nums) {
	        Arrays.sort(nums);
	        for (int i = 0; i < nums.length-1; i++) {
				if(nums[i]==nums[i+1]) {
					return true;
				}
			}
	        return false;
	    }
	
	

}
