import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,6,4,5,8,9};
        int si = 0;
        int ei= arr.length-1;
        while(si<=ei){
            swap(arr,si,ei);
            si++;
            ei--;
        }
        
       System.out.println(Arrays.toString(arr));
    }
    public static void  swap(int [] arr,int si,int ei){
        int temp = arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
    }
}
