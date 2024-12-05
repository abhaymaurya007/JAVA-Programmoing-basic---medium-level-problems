
/*5. Write a 'java' program to take the marks of a student in 5 subjects as input and determine how
many subjects have marks greater than or equal to 35 and how many have marks less than
35.
The program should not use any control statements (if, else, switch, etc.) or the ternary
operator.
DAILY LAB PRACTICE PROBLEMS
Sample input: int sub1 = 38, sub2 = 34, sub3 = 35, sub4 = 78, sub5 = 20 Sample
Output: Pass in 3 subject and fail in 2 subject*/
import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks for 5 subjects:");
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int sub4 = scanner.nextInt();
        int sub5 = scanner.nextInt();

        // Initialize count for passing subjects
        int count = 0;

        // Increment count if the marks are greater than 35
        count += (sub1 > 35 ? 1 : 0);
        count += (sub2 > 35 ? 1 : 0);
        count += (sub3 > 35 ? 1 : 0);
        count += (sub4 > 35 ? 1 : 0);
        count += (sub5 > 35 ? 1 : 0);

        // Display results
        System.out.println("Passed in " + count + " subjects and failed in " + (5 - count) + " subjects.");

        // Alternative calculation method
        int pass = (sub1 > 35 ? 1 : 0) +
                (sub2 > 35 ? 1 : 0) +
                (sub3 > 35 ? 1 : 0) +
                (sub4 > 35 ? 1 : 0) +
                (sub5 > 35 ? 1 : 0);

        System.out.println("Passed in " + pass + " subjects and failed in " + (5 - pass) + " subjects.");

        scanner.close();
    }
}
