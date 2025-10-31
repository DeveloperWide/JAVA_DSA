public class BreakContinue{
    public static void main(String[] args){
        //  Break & Continue Keyword in Java
         //1. Break
       /*  for(int i=1; i<=10; i++){
            if(i==100) break;
            System.out.print(i + ", "); 
        } */

        //   2. Continue 
        for(int i=0; i<=10; i++){
            if(i==7) continue;
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}