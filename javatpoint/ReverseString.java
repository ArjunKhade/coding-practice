public class ReverseString {
    public static void main(String[] args) {
        String s = "arjun";
       System.out.println( reverse(s));
    }

    public static String reverse (String str){
        
        char [] arr = str.toCharArray();
         int start = 0 ;
         int end = arr.length-1;

         while(start < end){
          char ch = arr[start];
          arr[start] = arr[end];
          arr[end] = ch;
          start++;
          end--;
         }
  
         String ans = new  String(arr);

        //  for (int i = str.length()-1; i>=0; i--) {
        //     ans = ans + str.charAt(i);
        //  }
        return ans;
    }
}
