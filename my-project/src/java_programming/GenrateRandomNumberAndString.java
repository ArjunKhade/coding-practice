package java_programming;

import java.util.Random;

public class GenrateRandomNumberAndString {
      public static void main(String[] args) {
		
    	  //Approach : 1 Random
    	  Random random = new Random();
    	  
    	  int num = random.nextInt(100);
    	  System.out.println(num);
    	  
    	  double num1 = random.nextDouble();
    	  System.out.println(num1);
    	  
    	  /***************************************/
    	  
    	  //Approach : 2  Math
    	  System.out.println(Math.random());
    	  
    	  /********************************************/
    	  
    	  //Approach : 3 Apache common lang api API
    	  
    //	 RandomStringUtils.randomNumeric(10);
    	 
    //	 RandomStringUtils.randomAlphabetic(10);
    	 
    	  
    	  
	}
}
