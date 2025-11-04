import java.util.Arrays;

public class ArrayClass{
    public static void main(String[] args){
        int nums[] = new int[100]; // 0 , 99
        // int[] numsArr = {45, 78, 97, 35};

        int num = 20;

        for(int i=0; i<=99; i++){
            num += 5;
            nums[i] = num;
            // System.out.print(nums[i] + ", ");
        }
        System.out.print(Arrays.toString(nums));
        System.out.println();
    }
}