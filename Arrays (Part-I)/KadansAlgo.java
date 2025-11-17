public class KadansAlgo{
    static void kadans_algo(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum SUB Array Sum : " + maxSum);
    }
    public static void main(String[] args){
        int[] nums = {10, 20, 30, -40 , 50, -60};
        kadans_algo(nums);
    }
}