/*write a c program to add first and last digit of 3 digit number*/
public class prob10 {
    public static void main(String[] args) {
        int num=356;
    if(num>99 && num<1000){
   System.out.printf("addition : %d",((num%10)+(num/100)));
}
else
System.out.printf("enter 3 digit number :");
    }
}
