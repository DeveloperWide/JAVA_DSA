public class FloydTriangle{

    public static void floyds_triangle(int rows){
        int count = 1;
        int n = rows;

        for(int i=1; i<=n; i++){
            // Count
            for(int j=1; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        floyds_triangle(5);
    }
}

/* 
      1 
     2 3 
    4 5 6 
   7 8 9 10 
11 12 13 14 15 

 */