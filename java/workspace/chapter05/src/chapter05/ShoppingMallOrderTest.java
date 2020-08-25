package chapter05;

public class ShoppingMallOrderTest {
	public static void main(String[] args) {
		ShoppingMallOrder order1 = new ShoppingMallOrder();
		order1.orderId = "201803120001";
		order1.customerId = "abc123";
		order1.orderDate = 20180312;
		order1.customerName = "홍길순";
		order1.productId = "PD0345-12";
		order1.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(order1.orderId);
		System.out.println(order1.customerId);
		System.out.println(order1.orderDate);
		System.out.println(order1.customerName);
		System.out.println(order1.productId);
		System.out.println(order1.shippingAddress);
		
	}
}
