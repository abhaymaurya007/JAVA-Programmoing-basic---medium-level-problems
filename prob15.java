/*Write a 'C' program to check and print the Maximum number among two numbers without
using IF-ELSE statement’s.
Sample input: int a = 10, b = 20
Sample Output: MAX = 20 */
import java.util.Scanner;
public class prob15 {
    public static void main(String[] args) {
        int num1,num2;
    System.out.print("enter 1st and 2nd number :");
           Scanner sc=new Scanner(System.in);
           num1=sc.nextInt();
           num2=sc.nextInt();
           System.out.printf(num1>num2?"num1 is biggest.":num2>num1?"num2 is biggest":"BOth are equal.");
           sc.close();
    
    }
}
