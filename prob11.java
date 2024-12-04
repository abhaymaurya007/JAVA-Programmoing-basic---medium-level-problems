/*Write a C program to convert temperature from Fahrenheit to Celsius.
C= (F - 32) * (5.0 / 9.0)
Input as :
Enter temperature in Fahrenheit: 100
 Expected output:
100.00 Fahrenheit is 37.78 Celsius. */
import java.util.Scanner;
public class prob11 {
    public static void main(String[] args) {
        float fahrenTem;
        System.out.printf("enter temprature in fahrentheit :");
        Scanner sc=new Scanner(System.in);
        fahrenTem=sc.nextInt();
        System.out.printf("%.2f faherenheit is %.2f Celsius.",fahrenTem,(fahrenTem-32)*(5.0/9.0)); 
        sc.close();  
    }
}
