package string;

public class ReverseString {

	public static void main(String[] args) {
		String s= "arjun";
		char[] arr = s.toCharArray();
		
		int si = 0;
		int ei = arr.length-1;
		
		while(si<=ei) {
			char temp = arr[si];
			arr[si]=arr[ei];
			arr[ei]=temp;
			
			si++;
			ei--;
			
		}
 
		String r = new String(arr);
		System.out.println(r);
	}

}
