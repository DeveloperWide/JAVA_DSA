public class ArrayPairs {

    static void print_pairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("Pairs of : "+ arr[i]);
            for(int j=i; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50, 60};
        print_pairs(nums);
    }
}