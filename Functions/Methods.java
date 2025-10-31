import java.lang.Math;

public class Methods{

    public static void printSentence(int num){
        num /= 10;
        System.out.println("IN print Methods : " +num);
    }

    public static int getProduct(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        System.out.println(Math.max(num1 , num2));

    }
}