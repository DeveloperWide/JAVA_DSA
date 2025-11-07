public class Complexity{
    public static void main(String[] args){
        // Time Complexity

        /* for(int i = 0; i<=10; i++){
            // O(n) -> Linear Time Complexity
            System.out.println(i);
        } */

    //    O(n^2) -> Quadratic Complexity
        for(int i=2; i<=3; i++){
            System.out.print("Table of "+ i + " : ");
            for(int j=1; j<=10; j++){
                System.out.print(i*j + ", ");
            }
            System.out.println();
        }
    } 
}