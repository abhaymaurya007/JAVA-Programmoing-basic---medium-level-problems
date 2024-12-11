package has2;

public class Shoping {
	public static void main(String[] args) {
		Order o1=new Order("112", "pizza");
		Customer c1=new Customer("akshay","akshaypagal@gmail.com", o1);
		System.out.println(c1);
	}

}
