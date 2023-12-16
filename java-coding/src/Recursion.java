public class Recursion {
    public static void main(String[] args) {
System.out.println(factorial(5));
    }

    static int factorial(int num){
          if(num <= 0){//base condition
            return 1;
          }
          int result= num * factorial(num-1);
        return result;
    }

}
