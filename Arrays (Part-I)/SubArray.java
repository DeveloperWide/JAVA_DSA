import java.util.*;

public class SubArray{
    public static void print_sub_array(int[] arr){
        int max = 0;
        int strIdx = 0;
        int endIdx = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Sub arrays of : " + arr[i]);
            for(int j=i; j<arr.length; j++){
                System.out.print("[");
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                    sum += arr[k];
                    if(k != j){
                        System.out.print(" , ");
                    }
                }
                if(sum > max){
                    strIdx = i;
                    endIdx = j;
                }
                max = Math.max(sum, max);
                System.out.print("]");
                System.out.println();
            }
            
            System.out.println();
            
        }
        System.out.println("Max Sum : (" + strIdx + ", " + endIdx + "); = " + max);
    }
    public static void main(String[] args){
        int[] nums = {10, 20, 30, -40 , 50, -60}; 
        print_sub_array(nums);
    }
}