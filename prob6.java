/*Write a c program to find the previous multiple of 10 of a given two d igit number input :- 56
output :-50*/
public class prob6 {
    public static void main(String[] args) {
        int num=56;
        if(num<0){num=-num;}
        if(num>9 && num<100)
        {
            System.out.println(num+" of previous multiple is "+((num/10)*10));
            System.out.println(num+" of previous multiple is "+(num-(num%10)));
        }
        else 
        System.out.println("enter exact 2 digit number");
    }
}
