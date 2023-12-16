package java_programming;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,80};
		
		int key = 100;
		boolean flag =false;
		
		for (int i = 0; i < a.length; i++) {
			
			if(key == a[i]) {
				System.out.println(a[i]+" Element Found At index:"+ i );
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Element Not Found!!!");
		}
		
	}

}
