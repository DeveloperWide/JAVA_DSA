import java.util.*;

public class BinaryToDecimal{

    // 1110 => 
    public static int binaryToDecimal(int n){
        int binaryNum = n;
        int decimalNum = 0;
        int pow = 0;
         while(binaryNum > 0){
            int lastdigit =  binaryNum % 10;
            decimalNum += lastdigit * Math.pow(2, pow);

            binaryNum /= 10;
            pow++;
         }

         return decimalNum;
    }

    public static void main(String[] args){
        System.out.println("Binary To Decimal");
        System.out.println(binaryToDecimal(1001));
    }
}