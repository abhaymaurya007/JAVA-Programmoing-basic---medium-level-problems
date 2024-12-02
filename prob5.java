
/*Write a c program to find the next multiple of 10 of a given two digit number
input :- 56
output :-60*/
import java.util.*;

public class prob5 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter two digit number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (num > 9 && num < 100) {
            // method 1
            System.out.println("next multiple of 10 0f " + num + " is " + (((num / 10) + 1) * 10));
            // method 2
            System.out.println("next multiple of 10 of " + num + " is " + ((10 - num % 10) + num));
        } else {
            System.out.println("error enter 2 digit only");
        }
        sc.close();
    }
}
