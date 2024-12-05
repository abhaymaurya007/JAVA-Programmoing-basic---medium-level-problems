/*.Area of Different Shape
Write a java program that takes 2 number as input and store that number in a variable, First
input for radius of a Circle and 2nd input for side of a Square. */
import java.util.Scanner;
public class prob18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radoiusOfCircle,SideOfSquare;
        System.out.printf("Enter Radius of Circle & Side of TRiangle Respectively   :");
        radoiusOfCircle=sc.nextFloat();
        SideOfSquare=sc.nextFloat();
        System.out.printf("Area of Circle  :%.2f\n",3.14*radoiusOfCircle*radoiusOfCircle);
        System.out.printf("Area of Square  %.2f",SideOfSquare*SideOfSquare);
        sc.close();
    }
}
