public class Rhombus{

    static void rhombus_pattern(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=n-1; j++){
                if(i==1 || j==1 || i==n || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        rhombus_pattern(5);
    }
}