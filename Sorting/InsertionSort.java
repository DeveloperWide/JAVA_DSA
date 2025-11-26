import java.util.*;

public class InsertionSort{

    public static void insertion_sort(int[] arr){
        // Insertion Sort Logic
        int n  = arr.length;

        for(int i=1; i<n; i++){ 
            
            int key = arr[i]; 
            int j = i-1; 

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }


    public static void main(String[] args){
        System.out.println("Insertion Sort");
        int[] nums = {30, 20, 59, 50, 35};
        insertion_sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}