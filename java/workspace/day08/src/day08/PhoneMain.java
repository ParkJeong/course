package day08;

public class PhoneMain {
	public static void main(String[] args) {
		Phone black = new Phone();
		black.info();
		
		Phone white = new Phone("white");
		white.info();
		
		Phone red = new Phone("빨강", 5000000);
		red.info();

		Phone green = new Phone("green", 1000000, "아이폰");
		green.info();
	}
}
