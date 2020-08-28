package day07;

public class MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 메서드는 메서드 내부에 선언할 수 없다.
		 * main밖에, 클래스 안 어디서든 선언할 수 있다.
		 */
		calcSum();
		System.out.println("1~10까지 합: " + calcSum());
		
		String result2 = randomStr();
		System.out.println(result2);
	}
	
	static int calcSum(){
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int calSum() {
		return 0;
	}
	
	static String randomStr() {
		String str = "";
		for(char i = 'A'; i <= 'Z'; i++) {
			str += i;
		}
		return str;
	}
	
	static String randomStr2() {
		String str = "";
		double d = Math.random();
		
		if(d > 0.66) {
			str = "가위";
		} else if (d > 0.33) {
			str = "바위";
		} else {
			str = "보";
		}
		
		return str;
	}
}
