/*Volume of a Sphere Develop a program to calculate the volume of a sphere and take the radius input
from user by using
scanf. */

import java.util.Scanner;

public class prob25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius;
        System.out.printf("Enter radius of sphere  :");
        radius=sc.nextFloat();
        float pie=3.14f;
        float volume=1.334f*pie*radius*radius*radius;
        System.out.printf("Volume of the Sphere is :%.2f",volume);
        sc.close();
    }
}
