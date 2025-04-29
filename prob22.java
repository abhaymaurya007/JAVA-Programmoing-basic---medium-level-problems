/*Calculate simple interest
Create a program that takes the principal amount, interest rate, and time in years from the
user and calculates the simple interest. Print the result with appropriate messages.*/

import java.util.Scanner;

public class prob22 {
    public static void main(String[] args) {
        float principal_amount,interest_rate,time,simple_interest;
        Scanner sc=new Scanner(System.in);
       System.out.printf("Enter principal amount :");
        principal_amount=sc.nextFloat();
        System.out.printf("Enter  interest rate :");
        interest_rate=sc.nextFloat();
      System.out.printf("Enter time in years :");
        time=sc.nextFloat();
        simple_interest=(principal_amount*interest_rate*time)/100;
        System.out.printf("Simple interest is  :%.3f",simple_interest);
        sc.close();
    }
}
