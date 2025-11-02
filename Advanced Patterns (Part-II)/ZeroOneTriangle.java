public class ZeroOneTriangle{

    public static void triangle_01(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i + j) % 2 == 0 ){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        triangle_01(5);
    }
}