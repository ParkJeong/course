package quiz10;

public class MyCart extends Cart{


	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	@Override
	void buy(String product) {
		if(money < 300) {
			System.out.println("금액부족");
			System.out.println("현재 보유 금액: " + money);
			this.info();
			return;
		}
		else {
			switch(product) {
			case "tv":
				money -= this.tv;
				this.add(product);
				break;
			case "com":
				money -= this.com;
				this.add(product);
				break;
			case "radio":
				money -= this.radio;
				this.add(product);
				break;
			default:
				System.out.println("상품없음");
			}
		}

	}

	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	@Override
	void add(String product) {
		if(this.i >= cart.length) {
			String[] tempCart = new String[cart.length * 2];
			for(int i = 0; i < cart.length; i++) {
				tempCart[i] = cart[i];
			}
			
			cart = tempCart;
//			cart = new String[cart.length * 2];
//			for(int i = 0; i < tempCart.length; i++) {
//				cart[i] = tempCart[i];
//			}
		}
		cart[this.i] = product;
		this.i++;
		this.info();
	}

	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */
	@Override
	void info() {
		if(this.i == 0) {
			System.out.println("담은 물건이 없습니다.");
		}
		
		for(int i = 0; i < this.i; i++) {
			String product = cart[i];
			int cost = 0;
			switch(product) {
			case "tv":
				cost = this.tv;
				break;
			case "com":
				cost = this.com;
				break;
			case "radio":
				cost = this.radio;
				break;
			}
			System.out.println( i + "번째 물품: "+ product + ", 가격: " + cost);
		}
		System.out.println("남은 돈: " + money);
		System.out.println("=========================");
	}
}

	
	

