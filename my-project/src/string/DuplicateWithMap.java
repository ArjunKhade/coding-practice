package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWithMap {

	public static void main(String[] args) {
			String s = "asdasfsfaf";
			
			char[] arr = s.toCharArray();
		
			Map<Character,Integer> map = new HashMap<>();
		
		    for (int i = 0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i],map.get(arr[i])+1);
				}else {
					map.put(arr[i],1);
				}
				
		    }
		    
		    //print map 
		    map.entrySet().forEach(entry -> {
		        System.out.println(entry.getKey() + "=> " + entry.getValue());
		    });
		   
		   
		    
		    
//			int a = 0;
//			int b =1;
//		     int sum=0;
	//	
//			for(int i = 0;i<10;i++) {
//				sum = a+b;
//				System.out.print(sum+",");
//				a=b;
//				b=sum;
//				
//				
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
//			String s = "arjun1234 1234";
//			
//			int count =0;
//			s = s.replaceAll("[a-z]","").replaceAll(" ","");
//			
//			char[] arr = s.toCharArray();
//			
	//	
//			for (int i = 0; i < arr.length; i++) {
//				
//				count++;
//			}
//			
//			System.out.println(count);
//			
			
			
			
			
			
			
			
//			
//			int rev = 0;
//			
//			while(num>0) {
//				rev = rev*10+num%10;
//				num=num/10;
//			}
//			
//			System.out.println(rev);
			

	}	
		
}	
	

		
		
			
			
		

	
