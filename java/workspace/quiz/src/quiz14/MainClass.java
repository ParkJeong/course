package quiz14;

public class MainClass {
	public static void main(String[] args) {
		MyCart myCart = new MyCart(2000);

		myCart.buy(new Tv());
		myCart.buy(new Radio());
		myCart.buy(new Computer());
		myCart.buy(new Radio());
		myCart.buy(new Computer());
		myCart.buy(new Tv());
	}
}
