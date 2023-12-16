public class Prime {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrime(num));
    }


    public static boolean isPrime(int num ){

         if(num <=  0 || num == 1 ){
            return false;
         }
          int c = 2 ;
          
         while(c*c <= num){
            if(num%c == 0){
                return false;
            }
            c++;
         }


        return true;
    }
}
