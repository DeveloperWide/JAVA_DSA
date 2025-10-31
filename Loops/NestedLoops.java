public class NestedLoops{
    public static void main(String[] args){
    //   Nested Loops
    /* for(int i=1; i<=5; i++){
        System.out.println("i : " +  i);
        for(int j=0; j<=10; j++){
            System.out.print(j+ ", ");
        }
        System.out.println();
    } */

   for(int i=5; i<=5; i++){
    System.out.println("Table of " + i );
    for(int j=1; j<=10; j++){
        System.out.println(i + " * " + j + " : " + i * j);
    }
   }
    }
} 