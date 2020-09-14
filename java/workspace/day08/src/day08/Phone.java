package day08;

public class Phone {
	String model;
	int price;
	String color;
	
	// 생성자: 생성자는 클래스 이름과 대/소문자까지 동일
	Phone() {
		System.out.println("생성자 호출");
		model = "롤리팝";
		price = 200000;
		color = "검정";
	}
	
	// 생성자는 중복해서 여러 개 선언할 수 있다.
	// 단, 매개변수의 종류나 개수가 달라야 한다.
	Phone(String pColor) {
		System.out.println("생성자 호출");
		model = "애니콜";
		price = 300000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice) {
		System.out.println("생성자 호출");
		model = "가로본능";
		price = pPrice;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice, String pModel) {
		System.out.println("생성자 호출");
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	void info() {
		System.out.println("---폰의 정보---");
		System.out.println("기종: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
