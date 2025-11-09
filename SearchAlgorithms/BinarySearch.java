import java.util.*;

public class BinarySearch{

    public static int binarySearch(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1; 

        while(start <= end){
            int mid = start + (end - start) / 2; // prevents overflow
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){ 
                start = mid + 1;   // search right half
            }
            else{
                end = mid - 1;     // search left half
            }
        }
        return -1; // not found
    }


    public static void main(String[] args) {
        int nums[] = {10, 20, 30 , 40, 50, 79, 89, 90, 125};
        int key = 79;
        
        int idx = binarySearch(nums, key);
        System.out.println(idx);
    }
}