package array;

import java.util.Arrays;
import java.util.Scanner;
public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		  1 2 3
		  4 5 6
		  7 8 9
		*/
        int [] [] arr1 = new int [3][];
        int [][] arr2D = {
                {1,2,3},//0th index
                {4,5,6},//1 index
                {7,8,9}  //2 index
        };


        int [][] arr = new int [3][3];
        //input 2d array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("Enter Number:");
                arr[row][col] = sc.nextInt();
            }
        }
        //print 2d array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //extended for loop for printing 2d array
           for(int [] a : arr){
               System.out.println(Arrays.toString(a));
           }

        //print with method Arrays.toString method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }





    }

}
