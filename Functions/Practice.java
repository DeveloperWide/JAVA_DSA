import java.util.*;

public class Practice{
    public static boolean isPrime(int n){
        if( n <= 1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }


    // public static String isOddorEven(int a){
    //     String even = a + " is a Even Number.";
    //     String odd = a + " is a Odd Number.";

    //     if(a%2 == 0) return even;
    //     return odd;
    // }

    public static void main(String[] args){
        // Check if a Number is odd Or Even
        // System.out.println(isOddorEven(10));
        System.out.println(isPrime(35));

    }
}