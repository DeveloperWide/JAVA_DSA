import java.util.*;

public class Prefix{

    public static void prefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        int maxSum = Integer.MIN_VALUE;
        int min_prefix_sum = 0;

        for(int i=1; i<arr.length; i++){
            prefixSum[i] +=  prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<prefixSum.length; i++){
            maxSum = Math.max(maxSum, prefixSum[i] - min_prefix_sum);
            min_prefix_sum = Math.min(min_prefix_sum, prefixSum[i]);
        }

        System.out.println("Max Sum : " + maxSum);
    }


    public static void main(String[] args){
        int[] nums = {10, 20, 30, -40 , 50, -60}; 
       prefixSum(nums);
    }
}