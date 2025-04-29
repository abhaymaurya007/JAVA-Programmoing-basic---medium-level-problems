/*Welcome to Tasty Treats Cafe: Bill Calculator
Develop below scenario program and take all the input from the user by using scanf().
Title: "Tasty Treats Cafe: Bill Calculator" Introduction:
Welcome to Tasty Treats Cafe! We provide a delightful selection of beverages and snacks to
satisfy your cravings. Today, you are our esteemed customer, and we are eager to serve you!
Let's calculate your bill based on your preferences.
Question:
How many cups of tea, cups of coffee, and biscuits would you like to order?
Instructions:
Each cup of tea costs ₹15, each cup of coffee costs ₹25, and each biscuit costs ₹10.
Please provide the quantity for each item you wish to order.
Example:
Customer: "I'd like to have 2 cups of tea, 1 cup of coffee, and 3 biscuits, please." Bill
Calculation:
2 cups of tea × ₹15 = ₹30
1 cup of coffee × ₹25 = ₹25*/

import java.util.Scanner;

public class prob24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int item1 = 15, item2 = 25, item3 = 10,item;
    int bill=0,quantity=0;
  System.out.printf("===============");
  System.out.printf("Tasty Treats Cafe !");
  System.out.printf("===============\n");
  System.out.printf("                    ");
  System.out.printf("Bill Calculator\n");
  System.out.printf("Welcome to Tasty Treats Cafe! We provide a delightful selection of beverages and snacks to satisfy your cravings. \n");
  System.out.printf("Choose your product by entering related number :\n");
  System.out.printf("1. Cup of Tea    15 Rupees\n");
  System.out.printf("2. Cup of cofee  25 Rupees\n");
  System.out.printf("3. Biscuits      10 Rupees\n");
  System.out.printf("4. Bill\n");
  System.out.printf("5. Exit\n");
for(;true;){
System.out.printf("\nEnter your chice :");
    item=sc.nextInt();
    if (item != 4 && item != 5)
    {
        System.out.printf("Enter quantity  :");
        quantity=sc.nextInt();
    }
    switch (item)
    {
    case 1:
        bill = bill + (item1 * quantity);
        break;
    case 2:
        bill = bill + (item2 * quantity);
        break;
    case 3:
        bill = bill + (item3 * quantity);
        break;
    case 4:
    {
        System.out.printf("your bill %d Rs.", bill);
        break;
    }
    case 5:
    System.out.printf("thank u for coming here.");
    System.out.printf("\nBYE");
        return ;
    default:
    System.out.printf("choose right number");
        
    }
    sc.close();
    }
    
}
}
