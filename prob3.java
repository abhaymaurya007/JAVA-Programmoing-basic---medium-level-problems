
/*Write a C program to reverse a two digit number without using any loop.
The given number is 13 and the output is 31*/
import java.util.*;

public abstract class prob3 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a two digit number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (num > 9 && num < 100) {
            System.out.println("reverse of" + num + "is " + (num % 10) + (num / 10));
        } else
            System.out.println("enter 2 digit number only.");
        sc.close();
    }

}
