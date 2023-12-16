package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.lang3.ArrayUtils;


public class DuplicateWithCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		 list.add(2);
		 list.add(2);
		 list.add(1);
		 list.add(3);
		  
		 int [] arr = {1,2,1,2,3};
		 
		 List<Integer> lists = Arrays.asList(ArrayUtils.toObject(arr));
		 
		 System.out.println("Cl"+lists.toString());
		 
		 System.out.println(list.toString());

		 Set<Integer> set = new HashSet<>(list);
		 
		 System.out.println(set.toString());
		 Set<Integer> set1 = new LinkedHashSet<>(list);
		 
		 System.out.println(set1.toString());
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			 if(map.containsKey(arr[i])) {
				 map.put(arr[i], map.get(arr[i])+1);
			 }else {
				 map.put(arr[i], 1);
			 }
			 
		}
		 
		 
		 Stack<Integer>s = new Stack<>();
		 
		 s.add(1);
		 
		System.out.println(s.toString());
		 
		 System.out.println(Arrays.toString(arr));
		 map.entrySet().forEach(e -> System.out.println(e.getKey()+"=> "+e.getValue()));
		 
	}

}
