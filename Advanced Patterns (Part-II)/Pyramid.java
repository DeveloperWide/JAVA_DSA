public class Pyramid{

    public static void right_half_pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverse_right_half_pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=i; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void left_half_pyramid(int rows){

        // Total Number Rows
        for(int i=1; i<=rows; i++){
            // Spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }

            // Stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // Next Line
            System.out.println();
        }
    }

    public static void reverse_left_half_pyramid(int rows){

        int n = rows;
        // Total Number Rows
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            // Stars
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }

            // Next Line
            System.out.println();
        }
    }


    public static void main(String[] args){
        // right_half_pyramid(5);
        // reverse_right_half_pyramid(5);
        // left_half_pyramid(5);
        reverse_left_half_pyramid(5);
    }
}