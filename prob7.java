/*Write a c program to find the next multiple of 10 of a given two digit number, if the given
number's last digit is less than 5 then find the previous multiple of 10 and if the given number's
DAILY LAB PRACTICE PROBLEMS
last digit is greater than or equal to 5 then find the next multiple of 10. [Dont use if else or
ternary operator ] */
import java.util.*;
public class prob7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int num = scanner.nextInt();

        boolean nextMultiple = (num % 10 > 5) && (System.out.printf("%d of next multiple is %d\n", num, ((num / 10) + 1) * 10) == null);
        boolean prevMultiple = (num % 10 <= 5) && (System.out.printf("%d of previous multiple is %d\n", num, (num / 10) * 10) == null);
        scanner.close();;
    }
}
