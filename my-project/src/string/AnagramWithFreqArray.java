package string;
import java.util.Scanner;

public class AnagramWithFreqArray {

    static boolean isAnagram(String a, String b) {
  
     if(a.length()!=b.length())return false;
     
     a=a.toLowerCase();
     b=b.toLowerCase();
     
     int [] freq_arr = new int [26];
     
     for (int i = 0; i < a.length(); i++) {
         char ch = a.charAt(i);
         int index = ch-'a';
         freq_arr[index]++;
     }
      for (int i = 0; i < b.length(); i++) {
         char ch = b.charAt(i);
         int index = ch-'a';
         freq_arr[index]--;
     }
     for (int i = 0; i < 26; i++) {
         if(freq_arr[i]!=0)return false;
     }      
      return true;
    }
    
    
    
    
    
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 String:");
        String a = scan.nextLine();
       
        System.out.println("Enter 2 String:");
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
