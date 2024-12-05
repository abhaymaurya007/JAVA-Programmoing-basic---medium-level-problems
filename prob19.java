/*Convert days in Y-M-D :
Write a program in java to input number of days. Find and display number of years, weeks, months
and days. */
import java.util.Scanner;
public class prob19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days;
        System.out.printf("Enter total days  :");
        days=sc.nextInt();
        int years=days/365;
        int months=(days%365)/30;
        int weeks=((days%365)%30)/7;
        days=((days%365)%30)%7;
        System.out.printf("%d years %d months weeks %d and %d days.",years,months,weeks,days);
        sc.close();
    }
}
