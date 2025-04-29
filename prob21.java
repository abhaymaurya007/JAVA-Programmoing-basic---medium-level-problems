/*Write a program that takes the total bill amount and the number of people from the user.
Calculate and print the amount each person needs to pay, assuming an equal split of the bill.  */
import java.util.Scanner;;
public class prob21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float amount;
       System.out.printf("Enter total bill have to pay :");
        amount=sc.nextFloat();
        int people;
        System.out.printf("Enter no. of people have to pay :");
        people=sc.nextInt();
        System.out.printf("per person should pay : %.2f",amount/(float)people);
        sc.close();
        
    }
}
