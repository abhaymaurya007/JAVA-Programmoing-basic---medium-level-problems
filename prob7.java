/*Write a c program to find the next multiple of 10 of a given two digit number, if the given
number's last digit is less than 5 then find the previous multiple of 10 and if the given number's
DAILY LAB PRACTICE PROBLEMS
last digit is greater than or equal to 5 then find the next multiple of 10. [Dont use if else or
ternary operator ] */
import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a two-digit number
        System.out.print("Enter a two-digit number: ");
        int num = scanner.nextInt();

        // Compute and print the next or previous multiple of 10
        System.out.printf(
            "%d of %s multiple is %d\n", 
            num, 
            (num % 10 >= 5) ? "next" : "previous", 
            (num % 10 >= 5) ? ((num / 10) + 1) * 10 : (num / 10) * 10
        );

        scanner.close();
    }
}

