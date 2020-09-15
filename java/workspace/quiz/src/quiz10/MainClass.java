package quiz10;

public class MainClass {
	public static void main(String[] args) {
		MyCart myCart1 = new MyCart(2000);
		MyCart myCart2 = new MyCart(3000);
		
		myCart1.buy("monitor");
		myCart1.buy("tv");
		myCart1.buy("com");
		myCart1.buy("radio");
		myCart1.buy("com");
		myCart1.buy("tv");
		myCart1.buy("tv");
	}
}
