public class Butterfly{
    static void butterfly_pattern(int n){
        for(int i=1; i<=n; i++){
            // Star before spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars After Spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            // Star before spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars After Spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        butterfly_pattern(5);
    }
}