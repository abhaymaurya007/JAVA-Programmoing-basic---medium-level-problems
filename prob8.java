/*Write a C program to reverse 3 digit number without using any loops. Given number is 786 and
expected output is 687. */
import java.util.Scanner;
public class prob8 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number  :");
        num=sc.nextInt();
        if(num<0){
           num=-num;
        }
        if(num>99 && num<1000){
            System.out.println(num+" of reverse is "+num%10+((num/10)%10)+(num/100));
        }
        else 
        System.out.println("enter 3 digit number only."); 
        sc.close();
    }
}
