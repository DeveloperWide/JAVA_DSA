import java.util.*;

public class Practice{
    public static void main(String[] args){
        // Practice Questions
        /* 
        Q1. Simple Interest Calculator
        Take principal, rate, and time from user and print the simple interest.
        Formula: SI = (principal * rate * time) / 100 
        */

        Scanner sc = new Scanner(System.in);

        /* System.out.print("What's The Principle Amount..? : ");
        int amount = sc.nextInt();

        System.out.print("Total Time invested for... : ");
        int time = sc.nextInt();

        System.out.print("With the Rate of : ");
        int rate = sc.nextInt();

System.out.println(amount + ", " + time + ", " + rate);
        double SI = (amount * time * rate)/100;
        System.out.println("₹" + SI); */

       /* 
       Q2. Temperature Converter
         Work : Convert temperature from Celsius to Fahrenheit and vice versa.
         Formula : F = (C * 9/5) + 32       
        */

       /* System.out.println("What's The Temperature in Celsius...? : ");

       int tempInC = sc.nextInt();

       int tempInF = (tempInC * 9/5) + 32;
       System.out.println("So Your Temp in Fahrenheit : " + tempInF + "°F"); */

       /* 
       Q3. Area & Perimeter of Rectangle
       Work : Take length and breadth as input and print both area and perimeter. 
      */

      /* System.out.print("What's The Width of Rectangle : ");
      int width = sc.nextInt();

      System.out.print("What's The Length of Rectangle : ");
      int length = sc.nextInt();

      int AreaOfRect = width * length;
      int PerimeterOfRect = 2 * (width + length);

      System.out.println("Area of Rectangle : " + AreaOfRect);
      System.out.println("Perimeter of Rectangle : " + PerimeterOfRect); */

    //   Q3.  find current age of a person by using birth Year.
    // Formula currYear - birthYear

    /* System.out.print("What's Your Year of Birth..? : ");
    int birthYear = sc.nextInt();

    System.out.print("Tell Me Current Year : ");
    int currYear = sc.nextInt();

    int userAge = currYear - birthYear;

    System.out.println("You're " + userAge + " Year Old");
        */

     /* 
      Sum of Digits of a 3-digit Number
      Example: Input 123 → Output 6
      */

     /* System.out.print("Write Any Number : ");
     int num = sc.nextInt(); 
     int n = num % 10; 
     int sum = 0;
     
     if( num > 0){
        sum += n;
        num /= 10;
        n = num % 10;
     }


     System.out.println("Sum of " + num + " : " + sum);
    } */

     /* 
     Q. Check Even or Odd (Without if-else)
      Use a ternary operator.
      */

    /* System.out.print("Write Any Number : ");
    int num = sc.nextInt();

    String isOddOrEven = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println("Your Number is : " + isOddOrEven); */

    }
}