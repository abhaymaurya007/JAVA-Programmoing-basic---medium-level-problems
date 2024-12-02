
/*Write a C program to find the previous multiple of 100 of a given three digit number .
 The given number is 234 and the output is 200.*/
import java.util.*;

public class prob2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a three digit number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (num > 99 && num < 1000) {
            System.out.println("method 1:");
            System.out.println("prevoius multiple of 100 of " + num + " is " + (num / 100) * 100);
            System.out.println("method 2:");
            System.out.println("prevoius multiple of 100 of " + num + " is " + (num - (num % 100)));
        } else {
            System.out.println("Error enter three digit number only.");
        }
        sc.close();
    }
}
