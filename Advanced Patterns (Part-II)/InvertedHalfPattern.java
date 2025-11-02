public class InvertedHalfPattern{
    // Inverted half Pattern with Numbers
    /* 

     1 2 3 4 5 
     1 2 3 4
     1 2 3
     1 2
     1

     */

    public static void inverted_half_pattern(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        inverted_half_pattern(5);
    }
}