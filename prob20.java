/*ASCII Sum
Write a C program to take two character input from the user and print the ASCII value of that two
character and display its sum. */
import java.util.Scanner;
public class prob20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch1,ch2;
    System.out.print("Enter 1st charcter :");
    ch1=sc.next().charAt(0);
    System.out.print("Enter 2nd charcter :");
    ch2=sc.next().charAt(0);
    System.out.printf("Addition of ASCII value is %d",ch1+ch2);
    sc.close();   
}
}
