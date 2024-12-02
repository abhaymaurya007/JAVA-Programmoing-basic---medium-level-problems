
/*Write a C program to add each digit of a given two digit number. 
The given number is 67.
Explanation 67 = 6 + 7 = 13
Expected output is : 13
*/
import java.util.*;

public class prob1 {
    public static void main(String[] args) {
        // Integer datatype variable created to store the number from user
        int num;
        // show massage to integer for enter a number
        System.out.println("enter two digit number :");
        Scanner sc = new Scanner(System.in);
        // input function for take value in runtime
        num = sc.nextInt();
        // check number is negative or not
        if (num < 0) {
            // convert into positive
            num = -num;
        }
        // check number have 2 digit or not
        if (num > 9 && num <= 99) {
            // logic to find addition of each digit and also print it.
            System.out.println("Addition of each two digit is :" + (num / 10 + num % 10));
        } else { // if number is not two digit then show a error massage
            System.out.println("Error  enter right two digit number. ");
        }
        sc.close();
    }

}