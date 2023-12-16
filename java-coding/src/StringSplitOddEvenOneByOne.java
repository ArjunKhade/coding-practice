public class StringSplitOddEvenOneByOne {
    public static void main(String[] args) {
        String s = "Hacker";
    
       char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                System.out.print(arr[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                System.out.print(arr[i]);

            }
        }
    }
}
