public class DecimalToBinary{
    public static String DecimalToBinary(int n){
        int decimalNum = n;
        String binaryNum = "";

        while(decimalNum > 0){
            int remainder = decimalNum % 2;
            binaryNum += remainder;
            
            decimalNum /= 2;
        }

        StringBuilder sb = new StringBuilder(binaryNum);
        String reversedBinaryNum = sb.reverse().toString();

        return reversedBinaryNum;
    }

    public static void main(String[] args){
        System.out.println(DecimalToBinary(9));
    }
}