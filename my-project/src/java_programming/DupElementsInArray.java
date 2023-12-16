package java_programming;

import java.util.HashSet;

public class DupElementsInArray {
     
	public static void main(String[] args) {
		
		String [] arr = {"java","c++","c","python","java"};
		
		//Approach : 1
//		boolean flag = false;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if(arr[j] == arr[i]) {
//					
//					System.out.println("Dup Found:"+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		
//		
//		if(!flag) {
//			System.out.println("No Dup Found!!!");
//		}
//		
		
		//Approach : 2 HashSet
		String [] arr1 = {"java","c++","c","python","java"};
		
		HashSet< String> hs = new HashSet<>();
		
		boolean flag=false;
		
		for(String s : arr1) {
			if(!hs.add(s)) {
				System.out.println("Dup Element:"+s);
				flag=true;
			}
		}
	
		if(flag==false) {
			System.out.println("No Dup Element:");
		}
	
		
		
		
		
		
		
		
		
	}
	
}
