import java.util.Arrays;

public class FunctionArgument{

    static void array_as_argument(int[] arr, int num){
        arr[2] = 39;
        num = 30;
    }


    public static void main(String[] args){
        System.out.println("Array As Function Argument");
        int[] nums = {20, 46, 90, 28, 17, 10};
        int num = 89;
        array_as_argument(nums, num); // 89
        System.out.println(Arrays.toString(nums));
        System.out.println(num);
    }
}