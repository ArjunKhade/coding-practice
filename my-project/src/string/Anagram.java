package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "welcome";
		String str2 = "mewelco";
		
	    char[] arr1 = str1.toCharArray();
	    char[] arr2 = str2.toCharArray();
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    String sortString1= new String(arr1);
	    String sortString2=new String (arr2);
	    
	    if(sortString1.equals(sortString2)) {
	    	System.out.println("Anagrame");
	    }else {
	    	System.out.println("Not Anagrame");
	    }

	}

}
