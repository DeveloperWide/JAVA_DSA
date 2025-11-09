import java.util.*;
public class ReverseArray{
    
    public static void reverse_array(int[] nums){
        int temp = 0;
        for(int i=0; i<nums.length / 2; i++){
            // swapping
            temp = nums[i]; 
            nums[i] = nums[nums.length - (i + 1)];
            nums[nums.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40 , 50, 60}; 
        reverse_array(nums);
    }
}