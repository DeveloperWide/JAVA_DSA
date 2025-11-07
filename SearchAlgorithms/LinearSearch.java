import java.util.*;

public class LinearSearch{

    static int findNum(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int nums[] = {30, 24, 31, 79, 35, 39};
        int num = 70;
        int value = findNum(nums, num);

        if(value >= 0){
            System.out.println(num + " Found at index : " + value);
        }else{
            System.out.println("Not Found : " + value);
        }
    }
}