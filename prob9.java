/*A shopkeeper buys a TV set for Rs. 3500 and sells it at a profit of 27%. Apart from this a VAT of
12.7% and Service Charge is 3.87% is charged.
5.1. Write a C program to Display total selling price, profit along with vat and service charge.
5.2. To calculate the selling price, profit, VAT, and service charge, follow these steps:
1) Calculate the selling price:
 Selling Price = Cost Price + Profit
 Selling Price = Rs. 3500 + (27% of Rs. 3500) 
 2) Calculate the profit: Profit = Selling Price - Cost Price
 3) Calculate VAT:
 VAT = 12.7% of Selling Price
4) Calculate Service Charge:
 Service Charge = 3.87% of Selling Price DAY – 4
 */
public class prob9 {
    public static void main(String[] args) {
        float purchasingprice=3500;

        float profitonTV=((purchasingprice*27f)/100);
        float vatOnTV=((purchasingprice*12.7f)/100);
        float serviceontv=((purchasingprice+profitonTV)*3.87f)/100;
        float selliingprice=purchasingprice+profitonTV+vatOnTV+serviceontv;
        System.out.printf("selling price of tv %.2f",selliingprice);
    }
}
