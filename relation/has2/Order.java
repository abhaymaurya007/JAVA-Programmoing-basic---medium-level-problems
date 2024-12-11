package has2;

public class Order {
	private String orderId;
	private String productName;
	public Order(String orderId, String productName) {
		super();
		this.orderId = orderId;
		this.productName = productName;
	}
//	public String getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(String orderId) {
//		this.orderId = orderId;
//	}
	public String getProductName() {
		return productName;
	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}
	
}
