package math;

import java.util.ArrayList;

public class Factors {
	
	public static void main(String[] args) {
	//	factors(20);
	//	factorsOptmized(20);
		factorsOptmized1(20);
	}
	
	//bootstrap
	static void factors(int n ) {
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i + " ");
			}
		}
	}
	
	//optimized
	static void factorsOptmized(int n ) {
		for (int i = 1; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				
				if(n/i == i) {
					System.out.print(i + " ");
				}else {
					System.out.print(i + " "+n/i + " ");
				}
				
			}
			
		}
	}
	
	//for proper formating 
	static void factorsOptmized1(int n ) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				
				if(n/i == i) {
					System.out.print(i + " ");
				}else {
					System.out.print(i + " ");
					list.add(n/i);
				}
				
			}
			
		}
		for (int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
		
		
	}
	
	
	
	
	
	
	

}
