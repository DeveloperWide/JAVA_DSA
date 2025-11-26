import java.util.Arrays;

public class CountingSort {

    public static void countSort(int[] arr) {
        int n = arr.length;

        // find the maximum element
        int maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            maxVal = Math.max(arr[i], maxVal);
        }

        // create cntArr array
        int[] cntArr = new int[maxVal + 1];

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            cntArr[arr[i]]++; 
        }

        //sorting
        int j=0;
        for(int i=0; i<cntArr.length; i++){
            while(cntArr[i] > 0){
                arr[j] = i;
                j++;
                cntArr[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}