import java.util.*;

public class BubbleSort{

    static void bubble_sort(int[] arr){
       int n = arr.length;
       for(int i=0; i<n-1; i++){
          boolean swapped = false;
          for(int j=0; j<n-i-1; j++){
            while(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
          }
          if(!swapped) break;
       }
    }


    public static void main(String[] args) {
        System.out.println("Bubble Sorting");
        int[] nums = {30, 20, 59, 50, 35};

        bubble_sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}