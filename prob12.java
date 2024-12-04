/*Write a program to take input for seconds from the user , And convert it into Hour, Minutes , Second
format. */
import java.util.Scanner;;
public class prob12 {
    public static void main(String[] args) {
        int Seconds;
    System.out.printf("Enter Total Second  :");
    Scanner sc=new Scanner(System.in);
    Seconds=sc.nextInt();
    int hours=Seconds/(60*60);
    Seconds=Seconds%(60*60);
    int minutes=Seconds/60;
    Seconds=Seconds%60;
    System.out.printf("Hours  %d,Minutes  %d, Seconds  %d",hours,minutes,Seconds);
    sc.close();   
}
}
