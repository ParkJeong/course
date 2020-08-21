package day02;

public class OperatorCondition {
	public static void main(String[] args) {
		
		// 0.0 이상 1.0 미만의 랜덤 double 값을 발생
		System.out.println(Math.random());
		
		// 1~10가지 랜덤값
		double d = Math.random() * 10;
		int result = (int)d + 1; // 1~10까지의 정수
		System.out.println(d);
		System.out.println(result);
		
		String result2 = (result % 3) == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		System.out.println(result2);
	}
}
