public class SubArray{

    public static void print_sub_array(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.println("Sub arrays of : " + arr[i]);
            for(int j=i; j<arr.length; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                     System.out.print(arr[k]);
                     if(k != j){
                         System.out.print(" , ");
                     }
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
            
        }
    }


    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40 , 50, 60}; 
        print_sub_array(nums);
    }
}