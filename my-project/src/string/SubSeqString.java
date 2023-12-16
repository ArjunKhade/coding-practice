package string;

import java.util.ArrayList;
import java.util.List;

public class SubSeqString {
	
	//with recursion
	static void subseq(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return ;
		}
		
		char ch = up.charAt(0);
		subseq(p+ch, up.substring(1));//add it
		subseq(p, up.substring(1));//ignore it	
	}
	
	/*****************************************************************/
	//return array list of substring
	static ArrayList<String> subSeqRetArrayList(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list ;
		}
		
		char ch = up.charAt(0);
		ArrayList<String> left = subSeqRetArrayList(p+ch, up.substring(1));//add it
		ArrayList<String> right=	subSeqRetArrayList(p, up.substring(1));//ignore it	
		
		left.addAll(right);
		return left;
	}
	
	
	/**********************************************************************/

	//Iterrative method using array

	static List<List<Integer>> subset(int []arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for(int num : arr) {
			int n = outer.size();
			for (int i = 0; i < n; i++) {
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		
		return outer;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	      
		  String s = "abc"; //a,b,c,ab,bc,ac,abc
		  subseq("", s);
		 
		  System.out.println( subSeqRetArrayList("", s));
		  
		  int [] arr = {1,2,3};
		  System.out.println(subset(arr));

		  //print abcd UPCASE
//		  for (int i =97 ; i < 97+26; i++) {
//			  char ch = (char) (i- 32);
//			   System.out.print(ch+",");
//		}
//		  
		//print abcd LCASE
//		  System.out.println();
//		  
//		  for (int i =97 ; i < 97+26; i++) {
//			  char ch = (char) (i);
//			   System.out.print(ch+",");
//		}


	}

}
