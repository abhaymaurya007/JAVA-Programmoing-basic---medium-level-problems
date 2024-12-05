/*Write a 'C' program to take the number of days and convert into (days:months:years)
Sample input: int days = 500
Sample Output: 1 year 4 month and 15 days. */

import java.util.Scanner;
public class prob17 {
    public static void main(String[] args) {
        int days;
    System.out.print("Enter total days  :");
    Scanner sc=new Scanner(System.in);
    days=sc.nextInt();
    int years=days/365;
    days=days%365;
    int months=days/30;
    days=days%30;
    System.out.printf("%d years %d months %d days.",years,months,days);
   sc.close();
}
    
    
}
