/*. Write a 'C' program to check and print that given number is even or odd without using
ternary operator and control statement’s.
Sample input: int a = 10
Sample Output: EVEN
Sample input: int a = 125
Sample Output: ODD*/
import java.util.Scanner;
public class prob14 {
    public static void main(String[] args) {
        int num;
    System.out.print("Enter a number :");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    if(num<0)num=-num;
    System.out.printf((num%2)==0?"Even":"Odd");
    sc.close();
    }
}
