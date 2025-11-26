import java.util.*;

public class SelectionSort{
    public static void selection_sort(int[] arr){
        int n = arr.length; // 5
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            // Swapping if needed
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args){
        System.out.println("Selection Sort");
        int[] nums = {30, 20, 59, 50, 35};
        selection_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}