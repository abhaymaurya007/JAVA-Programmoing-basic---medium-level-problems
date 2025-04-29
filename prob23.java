/*You are the owner of a bakery shop and need to create a program to generate invoices for your
customers. The program should prompt the user to enter the item they want to buy, the quantity they
wish to purchase, and the price of the item. Based on this input, the program should calculate the total
cost and display an invoice with all the details, including the item, quantity, price per item, and total
cost. At the end of the invoice, don't forget to thank the user for shopping at your bakery shop. Your
task is to write a C program that accomplishes this.
Instructions:
 Display a welcome message along with a separator line to greet the customer.
 Prompt the customer to enter the quantity they wish to purchase and store it in an integer
variable.
 Get the price of the item from the customer and store it in a floating-point variable.
 Calculate the total cost by multiplying the price with the quantity.
 Display the invoice with all the details, including item, quantity, price per item, and total cost.
 Make sure the total cost is displayed with two decimal places.
 End the invoice with a thank-you message for shopping at your bakery shop. */
import java.util.Scanner;

public class prob23 {
    public static void main(String[] args) {
        // Prices of items
        int item1 = 350, item2 = 450, item3 = 650, item4 = 750, item5 = 200;
        int bill = 0, quantity = 0, item;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("===============");
        System.out.println("Welcome to Sanaya Bakery Shop.");
        System.out.println("===============");
        System.out.println("                    ");
        System.out.println("GOOD MORNING");
        System.out.println("Choose your product by entering the related number:");
        System.out.println("1. Chocolate Cake  350");
        System.out.println("2. Pineapple Cake  450");
        System.out.println("3. Strawberry Cake  650");
        System.out.println("4. Vanilla Cake  750");
        System.out.println("5. Normal Cake  200");
        System.out.println("6. Bill");
        System.out.println("7. Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            item = scanner.nextInt();

            if (item != 6 && item != 7) {
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
            }

            switch (item) {
                case 1:
                    bill += item1 * quantity;
                    break;
                case 2:
                    bill += item2 * quantity;
                    break;
                case 3:
                    bill += item3 * quantity;
                    break;
                case 4:
                    bill += item4 * quantity;
                    break;
                case 5:
                    bill += item5 * quantity;
                    break;
                case 6:
                    System.out.println("Your bill: " + bill + " Rs.");
                    break;
                case 7:
                    System.out.println("Thank you for coming here.");
                    System.out.println("BYE");
                    scanner.close();
                    return;
                default:
                    System.out.println("Please choose the correct number.");
                    break;
            }
        }
    }
}
