/*Write a C program to print sum of N natural numbers without using loops.
Sample input : int n = 10
Sample output : 55 */
import java.util.Scanner;;
public class prob13 {
    public static void main(String[] args) {
        int num;
        System.out.printf("Enter number :");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
          System.out.printf("sum of natural numbers : %d",(num*(num+1))/2);
        sc.close();
    }
}
