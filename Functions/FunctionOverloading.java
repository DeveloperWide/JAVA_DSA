public class FunctionOverloading{
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args){
       int a = 20;
       int b = 30;
       

       float price  = 10.99f;
       float total = 20.79f;

       System.out.println("Sum of : "+ a + " + " + b + " : " + sum(a , b));
       System.out.println("Sum of : "+ price + " + " + total + " : " + sum(price , total));
    }
}