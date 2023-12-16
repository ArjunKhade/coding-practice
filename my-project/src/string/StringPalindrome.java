package string;

public class StringPalindrome {

    public static void main(String[] args) {
    String str = "abba";
        System.out.println(isPadindrome(str));

    }
      static  boolean isPadindrome(String str){

        if(str == null || str.length()==0){
            return  true;
        }

        str = str.toLowerCase();
          for (int i = 0; i < str.length()/2; i++) {
              char start = str.charAt(i);
              char end = str.charAt(str.length()-1-i);

              if (start != end){
                 return false;
              }

          }
        return true;
      }
}
